#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long x, y, k;
        cin >> x >> y >> k;

        // Formula derived from problem statement
        long long ans = ((k * y + k + x - 2 - 1) / (x - 1)) + k;

        cout << ans << "\n";
    }

    return 0;
}
