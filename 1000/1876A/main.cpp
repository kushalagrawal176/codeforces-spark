#include <bits/stdc++.h>
using namespace std;

int main() 
{
    long long t;
    cin >> t;

    while (t--) 
    {
        long long n, r;
        cin >> n >> r;

        vector<pair<long long, long long>> ans(n);

        // First input: f values
        for (int i = 0; i < n; i++) 
        {
            long long f;
            cin >> f;
            ans[i].first = f;
        }

        // Second input: helmet costs
        for (int i = 0; i < n; i++) 
        {
            long long cost;
            cin >> cost;
            ans[i].second = cost;
        }

        // Sort by cost
        sort(ans.begin(), ans.end(), [](auto &a, auto &b) {
            return a.second < b.second;
        });

        long long rem = n - 1;
        long long to = r;

        for (int i = 0; i < n; i++) 
        {
            if (ans[i].second >= r)
                break;

            long long c = min(rem, ans[i].first);
            to += c * ans[i].second;
            rem -= c;
        }

        to += r * rem;

        cout << to << "\n";
    }

    return 0;
}
