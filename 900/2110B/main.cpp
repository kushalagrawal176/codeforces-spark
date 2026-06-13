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

        string ans = "NO";
        int o = 0;

        for (int i = 0; i < (int)s.size(); i++) 
        {
            if (s[i] == '(')
                o++;
            else
                o--;

            if (o == 0 && i != (int)s.size() - 1)
                ans = "YES";
        }

        cout << ans << "\n";
    }

    return 0;
}
