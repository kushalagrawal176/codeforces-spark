#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        string a, b;
        cin >> a >> b;

        vector<int> freq(26, 0);
        for (char ch : b)
            freq[ch - 'a']++;

        bool flag = true;
        for (char ch : a) 
        {
            if (freq[ch - 'a'] == 0) 
            {
                flag = false;
                break;
            }

            freq[ch - 'a']--;
        }

        if (!flag) 
        {
            cout << "Impossible\n";
            continue;
        }

        string ans = "";
        int ptr = 0;

        for (int i = 0; i < 26; i++) 
        {
            // Append characters from 'a' to 'z' that are less than or equal to the current character
            // in the same order as they appear in 'a'
            while (ptr < (int)a.size() && (a[ptr] - 'a' <= i)) 
            {
                ans += a[ptr];
                ptr++;
            }

            // Append remaining characters for the current character
            while (freq[i] > 0) 
            {
                ans += char('a' + i);
                freq[i]--;
            }
        }

        cout << ans << "\n";
    }

    return 0;
}
