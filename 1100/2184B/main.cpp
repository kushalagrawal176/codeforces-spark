#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long s, k, m;
        cin >> s >> k >> m;

        if (((m / k) & 1) == 1)
            s = min(s, k);

        cout << max(0LL, s - m % k) << "\n";
    }

    return 0;
}
