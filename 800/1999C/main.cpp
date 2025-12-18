#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, s, m;
        cin >> n >> s >> m;

        bool flag = false;

        int l, r;
        cin >> l >> r;
        int prev_r = r;

        // Check before the first interval
        if (l >= s) flag = true;

        // Check gaps between intervals
        for (int i = 1; i < n; i++) 
        {
            cin >> l >> r;
            if (l - prev_r >= s) 
                flag = true;
            prev_r = r;
        }

        // Check after the last interval
        if (m - r >= s) 
            flag = true;

        cout << (flag ? "YES\n" : "NO\n");
    }

    return 0;
}
