#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, m;
        cin >> n >> m;

        if (min(n, m) >= 2 && max(n, m) >= 3)
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
