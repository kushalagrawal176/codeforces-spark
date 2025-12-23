#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        string a, s;
        cin >> a >> s;

        // Map each character to its position in the custom keyboard layout
        unordered_map<char, int> mp;
        for (int i = 0; i < 26; i++)
            mp[a[i]] = i + 1; // positions are 1-based

        int cost = 0;
        int pos = mp[s[0]];

        for (int i = 0; i < (int)s.size(); i++) 
        {
            cost += abs(mp[s[i]] - pos);
            pos = mp[s[i]];
        }

        cout << cost << "\n";
    }

    return 0;
}
