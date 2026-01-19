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
        vector<int> a(n);
        unordered_map<long long, long long> mp;

        for (int i = 0; i < n; i++) 
        {
            cin >> a[i];
            mp[i - a[i]]++;  // store frequency of (index - value)
        }

        long long cnt = 0;
        for (auto &p : mp) 
        {
            long long freq = p.second;
            if (freq > 1) 
            {
                // number of pairs = freq choose 2
                cnt += (freq * (freq - 1)) / 2;
            }
        }

        cout << cnt << "\n";
    }

    return 0;
}
