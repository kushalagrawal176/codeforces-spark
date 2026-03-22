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

        vector<char> res(n, '+');

        int l = 0, r = n - 1, either = 0;

        for (int i = 0; i < k; i++) 
        {
            if (s[i] == '0')
                l++;
            else if (s[i] == '1')
                r--;
            else
                either++;
        }

        for (int i = 0; i < n; i++) 
        {
            if (i > r - either || i < l + either)
                res[i] = '?';

            if (i < l || i > r || k == n)
                res[i] = '-';
        }

        for (char c : res)
            cout << c;
        cout << "\n";
    }

    return 0;
}
