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

        int cnt = 0;
        int one = 0;
        int o = 0;

        // Count total number of '1's
        for (char c : s)
            if (c == '1') one++;

        // Traverse string again
        for (char c : s) 
        {
            if (c == '1') 
            {
                o++;
                one--;
            } 
            else 
            {
                if (one > 0 && o > 0)
                    cnt++;
            }
        }

        cout << cnt << "\n";
    }

    return 0;
}
