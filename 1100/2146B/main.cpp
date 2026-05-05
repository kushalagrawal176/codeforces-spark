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

        vector<vector<int>> x(m + 1);
        for (int i = 0; i < n; i++) 
        {
            int l;
            cin >> l;

            for (int j = 0; j < l; j++) 
            {
                int a;
                cin >> a;

                x[a].push_back(i);
            }
        }

        bool b = true;
        for (int i = 1; i <= m; i++) 
        {
            if (x[i].empty())
                b = false;
        }

        unordered_set<int> s;
        for (int i = 1; i <= m; i++) 
        {
            if (x[i].size() == 1)
                s.insert(x[i][0]);
        }

        if (b && n - (int)s.size() >= 2)
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
