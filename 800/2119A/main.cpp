#include <bits/stdc++.h>
using namespace std;

int main() 
{
    long long t;
    cin >> t;

    while (t--) 
    {
        long long a, b, x, y;
        cin >> a >> b >> x >> y;

        if (a > b)
            cout << ((a ^ 1LL) == b ? y : -1) << "\n";
        else 
        {
            long long c0 = b - a;
            long long c1 = ((b + 1) / 2) - ((a + 1) / 2);
            long long result;

            if (y > x)
                result = c0 * x;
            else
                result = (c0 - c1) * x + c1 * y;

            cout << result << "\n";
        }
    }

    return 0;
}
