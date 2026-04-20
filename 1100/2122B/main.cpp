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

        long long ans = 0;

        for (int i = 0; i < n; i++) 
        {
            long long a, b, c, d;
            cin >> a >> b >> c >> d;

            if (b > d)
                ans += a + b - d;
            else if (a > c)
                ans += a - c;
        }

        cout << ans << "\n";
    }

    return 0;
}
