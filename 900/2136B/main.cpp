#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, k;
        cin >> n >> k;

        string s;
        cin >> s;

        bool flag = true;
        int one = 0;

        for (int i = 0; i < n; i++) 
        {
            if (s[i] == '1')
                one++;
            else
                one = 0;

            if (one >= k) // If there are k consecutive 1's then we can't find any permutation
                flag = false;
        }

        if (!flag) 
        {
            cout << "NO\n";
            continue;
        }

        cout << "YES\n";

        int high = n;  // assigning high values to "0"
        int low = 1;   // assigning low values to "1"

        for (int i = 0; i < n; i++) 
        {
            if (s[i] == '0')
                cout << high-- << " ";
            else
                cout << low++ << " ";
        }
        
        cout << "\n";
    }

    return 0;
}
