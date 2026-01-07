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

        int ans;
        cin >> ans;  // first number

        for (int i = 1; i < n; i++) 
        {
            int x;
            cin >> x;
            ans = ans & x;  // bitwise AND with next number
        }

        cout << ans << "\n";
    }

    return 0;
}
