#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, k;
        cin >> n >> k;

        string s;
        cin >> s;

        string r = "";
        bool distinct = true;

        for (int i = n - 1; i >= 0; i--) 
        {
            r += s[i];
            if (s[i] != s[0])
                distinct = false;
        }

        if (distinct)
            cout << "NO\n";
        else if (s < r || k > 0)
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
