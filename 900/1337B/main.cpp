#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int x, n, m;
        cin >> x >> n >> m;

        // Use Void Absorption while it reduces health and we still have spells
        while (n > 0 && x > 20) 
        {
            x = x / 2 + 10;
            n--;
        }

        // Use Lightning Strike
        x -= 10 * m;

        if (x <= 0)
            cout << "YES\n";
        else
            cout << "NO\n";
    }
    
    return 0;
}
