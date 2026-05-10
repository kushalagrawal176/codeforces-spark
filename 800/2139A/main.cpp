#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int a, b;
        cin >> a >> b;

        int ans = 2;

        if (a == b)
            ans = 0;
        else if (a % b == 0 || b % a == 0)
            ans = 1;
        else
            ans = 2;

        cout << ans << "\n";
    }

    return 0;
}
