#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long a, b;
        cin >> a >> b;

        int ans = 0;

        if (a == b)
            ans = 0;
        else if (a < b) 
        {
            if ((a & 1) != (b & 1))
                ans = 1;
            else
                ans = 2;
        } 
        else 
        {
            if ((a & 1) != (b & 1))
                ans = 2;
            else
                ans = 1;
        }

        cout << ans << "\n";
    }

    return 0;
}
