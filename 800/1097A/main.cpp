#include <bits/stdc++.h>
using namespace std;

int main() 
{
    string s;
    cin >> s;

    string ans = "NO";
    
    for (int i = 0; i < 5; i++) 
    {
        string a;
        cin >> a;

        if (a[0] == s[0] || a[1] == s[1]) {
            ans = "YES";
        }
    }
    
    cout << ans << endl;
    return 0;
}
