#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long x, y;
        cin >> x >> y;

        long long d = x + 1 - y;

        if (d >= 0 && d % 9 == 0)
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
