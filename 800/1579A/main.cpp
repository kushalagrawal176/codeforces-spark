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

        int cnt = 0;     // count of 'A' and 'C'
        int cnt_b = 0;   // count of 'B'

        for (char c : s) 
        {
            if (c == 'A' || c == 'C')
                cnt++;
            else
                cnt_b++;
        }

        if (cnt_b == cnt)
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
