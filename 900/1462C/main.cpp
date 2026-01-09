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

        string ans = "";
        for (int i = 9; i >= 1; i--) 
        {
            if (n >= i) 
            {
                ans = char('0' + i) + ans; // prepend digit
                n -= i;
            }
        }

        if (n == 0)
            cout << ans << "\n";
        else
            cout << -1 << "\n";
    }
    
    return 0;
}
