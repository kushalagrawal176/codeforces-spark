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

        string ans = "YES";
        if ((s.length() - 2) % 2 == 1)
            ans = "NO";
        else if (s.front() == ')' || s.back() == '(')
            ans = "NO";

        cout << ans << "\n";
    }

    return 0;
}
