#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        string p, s;
        cin >> p >> s;

        bool res = true;
        int i = 0, j = 0;
        char ch = p[0];

        while (i < (int)p.size() && j < (int)s.size()) 
        {
            int temp = 0;
            while (i < (int)p.size() && p[i] == ch) 
            {
                temp++;
                i++;
            }

            int temp2 = 0;
            while (j < (int)s.size() && s[j] == ch) 
            {
                temp2++;
                j++;
            }

            if (temp2 < temp || temp2 > temp * 2) 
            {
                res = false;
                break;
            }

            if (ch == 'L')
                ch = 'R';
            else
                ch = 'L';
        }

        if (i != (int)p.size() || j != (int)s.size())
            res = false;

        if (res)
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
