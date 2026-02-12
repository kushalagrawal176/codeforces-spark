#include <bits/stdc++.h>
using namespace std;

long long gcd(long long a, long long b) 
{
    if (a == 0) 
        return b;

    return gcd(b % a, a);
}

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long n;
        cin >> n;

        if ((n & 1) == 0)
            cout << n / 2 << " " << n / 2 << "\n";
        else 
        {
            long long a = -1;
            long long b = -1;
            long long lcm = LLONG_MAX;

            for (long long i = 1; i <= sqrt(n); i++) 
            {
                if (n % i == 0) 
                {
                    long long f1 = i;
                    long long l = (f1 * 1LL * (n - f1)) / gcd(f1, n - f1);
                    if (l < lcm) 
                    {
                        lcm = l;
                        a = f1;
                        b = n - f1;
                    }

                    if (i == 1) 
                        continue;

                    long long f2 = n / i;
                    l = (f2 * 1LL * (n - f2)) / gcd(f2, n - f2);
                    if (l < lcm) 
                    {
                        lcm = l;
                        a = f2;
                        b = n - f2;
                    }
                }
            }

            cout << a << " " << b << "\n";
        }
    }
    
    return 0;
}
