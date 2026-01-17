#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, x;
        cin >> n >> x;

        vector<int> a(n);
        int h = 0;
        for (int i = 0; i < n; i++) 
        {
            cin >> a[i];
            h = max(h, a[i]);
        }

        long long ans = -1;
        long long l = 0, r = h + x;

        while (l <= r) 
        {
            long long mid = (l + r) / 2;

            long long sum = 0;
            for (int i = 0; i < n; i++)
                sum += max(0LL, mid - (long long)a[i]);

            if (x >= sum) 
                ans = mid;

            if (sum == x) 
                break;

            if (x > sum)
                l = mid + 1;
            else 
                r = mid - 1;
        }

        cout << ans << "\n";
    }

    return 0;
}
