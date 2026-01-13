#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        string s;
        cin >> s;

        int o = 0, z = 0;

        // Count number of 0s and 1s
        for (char c : s) 
        {
            if (c == '0')
                z++;
            else
                o++;
        }

        // Process string
        for (char c : s) 
        {
            if (c == '0' && o == 0)
                break;
            if (c == '1' && z == 0)
                break;

            if (c == '1')
                z--;
            else
                o--;
        }

        cout << (z + o) << "\n";
    }

    return 0;
}
