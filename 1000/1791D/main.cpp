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
        string s;
        cin >> s;

        unordered_map<char, int> mp;
        for (char c : s)
            mp[c]++;

        int maxi = mp.size();
        unordered_map<char, int> prefix;

        for (int i = 0; i < n; i++) 
        {
            prefix[s[i]]++;

            mp[s[i]]--;
            if (mp[s[i]] == 0)
                mp.erase(s[i]);

            maxi = max(maxi, (int)prefix.size() + (int)mp.size());
        }

        cout << maxi << "\n";
    }

    return 0;
}
