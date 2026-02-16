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

        vector<int> a(n);

        // Fill alternating pattern
        for (int i = 0; i < n - 1; i += 2) 
        {
            a[i] = -1;
            a[i + 1] = 3;
        }

        // Handle last element depending on parity of n
        if (n & 1)
            a[n - 1] = -1;
        else
            a[n - 1] = 2;

        // Output the array
        for (int i = 0; i < n; i++)
            cout << a[i] << " ";
        
        cout << "\n";
    }

    return 0;
}
