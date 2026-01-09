#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long x, n;
        cin >> x >> n;

        long long a[4] = {0, -n, 1, n + 1};

        if (x % 2 == 0)
            cout << x + a[n % 4] << "\n";
        else
            cout << x - a[n % 4] << "\n";
    }
    
    return 0;
}
