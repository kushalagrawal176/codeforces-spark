#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;
    
    while (t--) 
    {
        long long a, b, c, n;
        cin >> a >> b >> c >> n;

        long long mx = max({a, b, c});
        long long ans = n - (3 * mx - (a + b + c));

        cout << ((ans % 3 == 0 && ans >= 0) ? "YES" : "NO") << "\n";
    }

    return 0;
}
