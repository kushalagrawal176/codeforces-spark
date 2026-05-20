#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int a, b, c, d;
        cin >> a >> b >> c >> d;

        bool k1 = 2 * (min(a, b) + 1) >= max(a, b);
        bool k2 = 2 * (min(c - a, d - b) + 1) >= max(c - a, d - b);

        if (k1 && k2)
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
