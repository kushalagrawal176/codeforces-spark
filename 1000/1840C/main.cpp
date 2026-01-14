#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, k, q;
        cin >> n >> k >> q;

        long long ans = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) 
        {
            int num;
            cin >> num;

            if (num <= q)
                cnt++;
            else
                cnt = 0;

            if (cnt >= k) 
                ans += (cnt - k + 1);
        }

        cout << ans << "\n";
    }

    return 0;
}
