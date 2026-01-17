#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long a;
        cin >> a;
        bool flag = false;

        for (long long i = 1; i * i * i <= a; i++) 
        {
            long long rem = a - i * i * i;
            if (rem <= 0) 
                continue;

            // Compute cube root of remainder
            long long c = cbrt(rem);

            // Check if c^3 equals rem (to avoid floating precision issues)
            if (c * c * c == rem || (c + 1) * (c + 1) * (c + 1) == rem) 
            {
                flag = true;
                break;
            }
        }

        if (flag)
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
