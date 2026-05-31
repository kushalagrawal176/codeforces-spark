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

        for (int i = 1; i <= n; i++) 
        {
            // For odd n, the middle element (n/2+1) should be placed at the end, 
            // and the last element (n) should be placed at the middle.
            // For even n, the elements should be reversed.

            if ((n & 1) && i == n / 2 + 1)
                cout << 1 << " ";
            else if ((n & 1) && i == n)
                cout << n / 2 + 1 << " ";
            else
                cout << n - i + 1 << " ";
        }

        cout << "\n";
    }

    return 0;
}
