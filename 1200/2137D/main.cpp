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
 
        vector<int> b(n);
        map<int, vector<int>> pos;
 
        for (int i = 0; i < n; i++) 
        {
            cin >> b[i];
            pos[b[i]].push_back(i);
        }
 
        bool ok = true;
 
        for (auto &[x, v] : pos) 
        {
            if ((int)v.size() % x != 0) 
            {
                ok = false;
                break;
            }
        }
 
        if (!ok) 
        {
            cout << -1 << "\n";
            continue;
        }
 
        vector<int> a(n);
        int current = 1;
 
        for (auto &[x, v] : pos) 
        {
            for (int i = 0; i < (int)v.size(); i += x) 
            {
                for (int j = 0; j < x; j++) 
                {
                    a[v[i + j]] = current;
                }
 
                current++;
            }
        }
 
        for (int i = 0; i < n; i++)
            cout << a[i] << " ";
 
        cout << "\n";
    }
 
    return 0;
}