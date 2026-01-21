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

        vector<int> arr(n);
        for (int i = 0; i < n; i++)
            cin >> arr[i];

        sort(arr.begin(), arr.end());  // sort ascending

        long long a = 0, b = 0;
        bool turn = true;  // Alice starts

        for (int i = n - 1; i >= 0; i--) 
        {
            if (turn) 
            {  // Alice's turn
                turn = false;
                if (arr[i] % 2 == 0) a += arr[i];
            } 
            else 
            {  // Bob's turn
                turn = true;
                if (arr[i] % 2 == 1) b += arr[i];
            }
        }

        if (a > b)
            cout << "Alice\n";
        else if (b > a)
            cout << "Bob\n";
        else
            cout << "Tie\n";
    }

    return 0;
}
