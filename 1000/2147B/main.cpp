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

        // Print numbers from n down to 1
        for (int i = n; i > 0; i--)
            cout << i << " ";

        // Print n again
        cout << n << " ";

        // Print numbers from 1 to n-1
        for (int i = 1; i < n; i++)
            cout << i << " ";

        cout << "\n";
    }

    return 0;
}
