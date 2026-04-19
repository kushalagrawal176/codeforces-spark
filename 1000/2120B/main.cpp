#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, s;
        cin >> n >> s;

        int ans = 0;

        for (int i = 0; i < n; i++) 
        {
            int x, y, z, w;
            cin >> x >> y >> z >> w;

            int k = abs(x * z - y * w);
            if (k == 0 || k == s) 
                ans++;
        }

        cout << ans << "\n";
    }

    return 0;
}
