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
        string s;
        cin >> s;

        int z = 0; // count of zeros
        for (int i = 0; i < n; i++) 
        {
            if (s[i] == '0')
                z++;
        }

        int r = 0; // count of misplaced ones in first z positions
        for (int i = 0; i < z; i++) 
        {
            if (s[i] == '1')
                r++;
        }

        cout << r << "\n";
    }

    return 0;
}
