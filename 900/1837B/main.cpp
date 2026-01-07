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

        int cnt = 1;
        int ans = 1;

        for (int i = 0; i < n - 1; i++) 
        {
            if (s[i] == s[i + 1])
                cnt++;
            else
                cnt = 1;
            
            ans = max(ans, cnt);
        }

        cout << ans + 1 << "\n";
    }

    return 0;
}
