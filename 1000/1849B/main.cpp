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

        vector<pair<int,int>> ans(n);

        for (int i = 0; i < n; i++) 
        {
            int x;
            cin >> x;

            if (x % k == 0)
                ans[i].first = k;
            else
                ans[i].first = x % k;

            ans[i].second = i + 1; // store index (1-based)
        }

        // Sort by remainder descending, keeping index order if equal
        sort(ans.begin(), ans.end(), [](auto &a, auto &b) {
            if (a.first == b.first) 
                return a.second < b.second;
                
            return a.first > b.first;
        });

        for (int i = 0; i < n; i++)
            cout << ans[i].second << " ";
        cout << "\n";
    }

    return 0;
}
