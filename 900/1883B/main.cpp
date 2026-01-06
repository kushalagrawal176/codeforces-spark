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

        string s;
        cin >> s;

        int one = 0;
        int odd = 0;

        unordered_map<char, int> mp;
        for (int i = 0; i < (int)s.size(); i++)
            mp[s[i]]++;

        int deleteCount = 0;
        for (int i = 0; i < (int)s.size(); i++) 
        {
            if (mp[s[i]] == 1) 
            {
                if (odd > 0) 
                {
                    if (one > 0)
                        deleteCount += 2;
                    else
                        deleteCount += 1;
                    one = 0;
                } 
                else 
                {
                    if (one > 0)
                        deleteCount += 1;
                    else
                        one = 1;
                }
            } 
            else if (mp[s[i]] % 2 == 1) 
            {
                if (one == 1) 
                {
                    one = 0;
                    deleteCount += 1;
                    odd = mp[s[i]];
                } 
                else 
                {
                    if (odd > 0) 
                    {
                        deleteCount += min(mp[s[i]], odd);
                        odd = max(mp[s[i]], odd);
                    } 
                    else
                        odd = mp[s[i]];
                }
            }
            // else even count, do nothing
            mp[s[i]] = 0;
        }

        if (deleteCount <= k)
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
