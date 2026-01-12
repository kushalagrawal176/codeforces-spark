#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin >> n;

    while (n--) 
    {
        string s, t;
        cin >> s >> t;

        vector<int> freq(26, 0);
        for (char c : t)
            freq[c - 'A']++;

        string ans = "";
        for (int i = (int)s.size() - 1; i >= 0; i--) 
        {
            if (freq[s[i] - 'A'] > 0) 
            {
                ans += s[i];
                freq[s[i] - 'A']--;
            }
        }

        reverse(ans.begin(), ans.end());

        if (ans == t)
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
