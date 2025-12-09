#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, k;
        cin >> n >> k;
        vector<long long> arr(n);

        for (int i = 0; i < n; i++) 
        {
            cin >> arr[i];
        }

        sort(arr.begin(), arr.end());

        // prefix sum array
        vector<long long> pre(n + 1, 0);
        for (int i = 0; i < n; i++) 
        {
            pre[i + 1] = pre[i] + arr[i];
        }

        long long ans = 0;
        for (int i = 0; i <= k; i++) 
        {
            if (2 * i <= n && n - (k - i) >= 0) 
            {
                ans = max(ans, pre[n - (k - i)] - pre[2 * i]);
            }
        }

        cout << ans << "\n";
    }

    return 0;
}
