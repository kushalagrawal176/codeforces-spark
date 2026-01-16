#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int a, b, c, d;
        cin >> a >> b >> c >> d;

        int ans = min(b, d) - max(a, c);

        if (ans < 0)
            cout << 1 << "\n";
        else 
        {
            if (a != c) 
                ans += 1;
            if (b != d) 
                ans += 1;
            cout << ans << "\n";
        }
    }

    return 0;
}
