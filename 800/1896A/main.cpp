#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t; // number of test cases

    while (t--) 
    {
        int n;
        cin >> n; // size of the array

        int first;
        cin >> first; // first element of the array

        // Read the remaining elements but ignore them
        for (int i = 1; i < n; i++) 
        {
            int a;
            cin >> a;
        }

        // Check condition
        if (first == 1)
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
