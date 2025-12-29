#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        string s;
        cin >> s;
        int l = s.size();

        bool modified = false;
        for (int i = 0; i < (int)s.size() - 1; i++) 
        {
            if (s[i] == s[i + 1]) 
            {
                char ch = s[i];
                ch = (char)((ch - 'a' + 1) % 26 + 'a');

                string s1 = s.substr(0, i + 1);
                string s2 = s.substr(i + 1);
                s = s1 + ch + s2;

                modified = true;
                break;
            }
        }

        if (!modified) 
        {
            char ch = s[0];
            ch = (char)((ch - 'a' + 1) % 26 + 'a');
            s = ch + s;
        }

        cout << s << "\n";
    }

    return 0;
}
