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

        vector<int> a(n);
        for (int i = 0; i < n; i++)
            cin >> a[i];

        long long ans = 0;

        if (k >= 2) 
        {
            sort(a.begin(), a.end());
            for (int i = n - 1; i >= n - k - 1; i--)
                ans += a[i];
        } 
        else 
        {
            ans = a[0] + a[n - 1];
            for (int i = 1; i < n - 1; i++)
                ans = max(ans, (long long)max(a[0], a[n - 1]) + a[i]);
        }

        cout << ans << "\n";
    }

    return 0;
}
