#include <bits/stdc++.h>
using namespace std;

const int MOD = 1e9 + 7;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long n, k;
        cin >> n >> k;

        long long cnt = 1;
        for (int i = 1; i <= k; i++) 
        {
            cnt = (cnt * n) % MOD;
        }

        cout << cnt << "\n";
    }

    return 0;
}
