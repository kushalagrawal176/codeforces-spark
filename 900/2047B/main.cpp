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

        vector<int> freq(26, 0);
        for (char c : s)
            freq[c - 'a']++;

        int mini = s.size();
        int maxi = 0;
        char min_ch = ' ';
        char max_ch = ' ';

        for (int i = 0; i < 26; i++) 
        {
            if (freq[i] == 0) 
                continue;

            if (freq[i] < mini) 
            {
                mini = freq[i];
                min_ch = char('a' + i);
            }

            if (freq[i] >= maxi) 
            {
                maxi = freq[i];
                max_ch = char('a' + i);
            }
        }

        for (int i = 0; i < n; i++) 
        {
            if (s[i] == min_ch) 
            {
                s[i] = max_ch;
                break;
            }
        }

        cout << s << "\n";
    }

    return 0;
}
