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

        vector<string> a(n);
        unordered_set<string> mp;

        for (int i = 0; i < n; i++) 
        {
            cin >> a[i];
            mp.insert(a[i]);
        }

        for (int i = 0; i < n; i++) 
        {
            bool flag = false;
            for (int j = 1; j < (int)a[i].size(); j++) 
            { 
                // split into prefix and suffix
                string s1 = a[i].substr(0, j);
                string s2 = a[i].substr(j);

                if (mp.count(s1) && mp.count(s2)) 
                {
                    flag = true;
                    break;
                }
            }

            cout << (flag ? 1 : 0);
        }
        cout << "\n";
    }

    return 0;
}