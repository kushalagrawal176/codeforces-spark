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
        int res = 0, cnt = 0;

        for (int i = 0; i < (int)s.size() - 1; ++i) 
        {
            if (s[i] == '1' && s[i + 1] == '0')
                res++;
            if (s[i] == '0' && s[i + 1] == '1')
                cnt++;
        }
        cout << res + max(cnt, 1) << "\n";
    }
    
    return 0;
}
