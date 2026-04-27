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
        vector<int> p(n + 1);

        for (int i = 0; i < n; i++) 
        {
            int x;
            cin >> x;
            p[x] = i;
        }

        int l = p[n], r = p[n];
        bool ok = true;

        for (int k = 1; k <= n; k++) 
        {
            int v = n - k + 1;
            l = min(l, p[v]);
            r = max(r, p[v]);

            if (r - l + 1 != k)
            {
                ok = false;
                break;
            }
        }

        cout << (ok ? "YES" : "NO") << "\n";
    }

    return 0;
}
