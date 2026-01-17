#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n, m, k;
    cin >> n >> m >> k;

    vector<int> a(m + 1);
    for (int i = 0; i <= m; i++)
        cin >> a[i];

    int cnt = 0;
    for (int i = 0; i < m; i++) 
    {
        // XOR to find differing bits, then count set bits
        if (__builtin_popcount(a[i] ^ a[m]) <= k)
            cnt++;
    }

    cout << cnt << "\n";

    return 0;
}
