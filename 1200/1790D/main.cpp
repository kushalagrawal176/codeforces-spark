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
        unordered_map<int, int> mp;

        for (int i = 0; i < n; i++) 
        {
            int a;
            cin >> a;
            mp[a]++;
        }

        long long cnt = 0;
        for (auto &p : mp) 
        {
            int key = p.first;
            int val = p.second;
            cnt += max(0, val - mp[key - 1]);
        }

        cout << cnt << "\n";
    }

    return 0;
}
