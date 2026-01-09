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

        // Read the array, but values are irrelevant for the solution
        for (int i = 0; i < n; i++) 
        {
            int a;
            cin >> a;
        }

        if ((n & 1) == 0) 
        {
            cout << 2 << "\n";
            cout << 1 << " " << n << "\n";
            cout << 1 << " " << n << "\n";
        } 
        else 
        {
            cout << 4 << "\n";
            cout << 1 << " " << n - 1 << "\n";
            cout << 1 << " " << n - 1 << "\n";
            cout << n - 1 << " " << n << "\n";
            cout << n - 1 << " " << n << "\n";
        }
    }
    return 0;
}
