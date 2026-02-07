#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, m;
        cin >> n >> m;

        long long h;
        cin >> h;

        vector<long long> a(n);
        for (int i = 0; i < n; i++)
            cin >> a[i];

        unordered_map<int, long long> mp;

        while (m--) 
        {
            int b;
            long long c;
            cin >> b >> c;
            b--; // convert to 0-based index

            if (mp.find(b) == mp.end())
                mp[b] = a[b] + c;
            else
                mp[b] += c;

            if (mp[b] > h)
                mp.clear();
        }

        for (int i = 0; i < n; i++) 
        {
            if (mp.find(i) != mp.end())
                cout << mp[i] << " ";
            else
                cout << a[i] << " ";
        }
        
        cout << "\n";
    }

    return 0;
}
