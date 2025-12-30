#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, a, b;
        cin >> n >> a >> b;

        if (n == a && n == b)
            cout << "YES\n";
        else if (n == a || n == b)
            cout << "NO\n";
        else if (n - a - b >= 2)
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
