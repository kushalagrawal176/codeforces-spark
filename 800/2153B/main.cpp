#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int x, y, z;
        cin >> x >> y >> z;

        if (((x & y) == (y & z)) && ((x & z) == (x & y)))
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
