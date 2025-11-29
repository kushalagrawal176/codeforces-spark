#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        cin >> n;

        // Check if balanced array is possible
        if ((n / 2) % 2 != 0)
            cout << "NO\n";
        else 
        {
            cout << "YES\n";
            vector<int> arr;

            // First half: even numbers
            for (int i = 2; i <= n; i += 2) {
                arr.push_back(i);
            }

            // Second half: odd numbers except the last one
            for (int i = 1; i < n - 1; i += 2) {
                arr.push_back(i);
            }

            // Last element to balance the sum
            int sumEven = (n / 2) * (n / 2 + 1); // sum of first n/2 even numbers
            int sumOdd = (n / 2 - 1) * (n / 2 - 1); // sum of first (n/2 - 1) odd numbers
            arr.push_back(sumEven - sumOdd);

            // Print the array
            for (int x : arr) {
                cout << x << " ";
            }
            cout << "\n";
        }
    }

    return 0;
}
