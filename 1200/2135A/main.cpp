#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        cin >> n;

        vector<int> a(n + 1);
        for (int i = 1; i <= n; i++)
            cin >> a[i];

        vector<int> dp(n + 1, 0);
        unordered_map<int, vector<int>> mp;

        for (int i = 1; i <= n; i++)
        {
            dp[i] = dp[i - 1];
            int v = a[i];

            mp[v].push_back(i);
            auto &list = mp[v];

            if ((int)list.size() >= v)
            {
                int pos = list[list.size() - v];
                dp[i] = max(dp[i], dp[pos - 1] + v);
            }
        }

        cout << dp[n] << "\n";
    }

    return 0;
}
