#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;
    while (t--) 
    {
        long long a, b, x, y, n;
        cin >> a >> b >> x >> y >> n;

        // Option 1: reduce a first
        long long reduceA = min(n, a - x);
        long long newA = a - reduceA;
        long long remainingN = n - reduceA;
        long long newB = b - min(remainingN, b - y);
        long long product1 = newA * newB;

        // Option 2: reduce b first
        long long reduceB = min(n, b - y);
        long long newB2 = b - reduceB;
        long long remainingN2 = n - reduceB;
        long long newA2 = a - min(remainingN2, a - x);
        long long product2 = newA2 * newB2;

        cout << min(product1, product2) << "\n";
    }

    return 0;
}
