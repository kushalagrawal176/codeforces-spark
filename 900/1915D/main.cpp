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

        string ans;
        int i = 0;

        for (; i < n - 3; ) 
        {
            char ch1 = s[i];
            char ch2 = s[i + 1];
            char ch3 = s[i + 2];
            char ch4 = s[i + 3];

            ans.push_back(ch1);
            ans.push_back(ch2);

            i += 1;

            if (ch4 != 'a' && ch4 != 'e') 
            {
                ans.push_back(ch3);
                i++;
            }

            ans.push_back('.');
            i++;
        }

        for (; i < n; i++)
            ans.push_back(s[i]);

        cout << ans << "\n";
    }

    return 0;
}
