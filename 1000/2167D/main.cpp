#include <bits/stdc++.h>
using namespace std;

long long gcd(long long a, long long b) 
{
    if (b == 0)
        return a;

    return gcd(b, a % b);
}

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        long long g;
        cin >> n >> g;

        for (int i = 1; i < n; i++) 
        {
            long long x;
            cin >> x;

            g = gcd(g, x);
        }

        if (g == 1) 
        {
            cout << 2 << "\n";
            continue;
        }

        for (int i = 2; i <= 10000; i++) 
        {
            if (gcd(g, i) == 1) 
            {
                cout << i << "\n";
                break;
            }
        }
    }

    return 0;
}
