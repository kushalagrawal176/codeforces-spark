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

        int ans = (int)s.size();
        for (int i = 1; i < (int)s.size(); i++) 
        {
            if (s[i] == s[i - 1])
                ans = 1;
        }

        cout << ans << "\n";
    }

    return 0;
}
