#include <bits/stdc++.h>
using namespace std;

bool isPrime(long long n) 
{
    if (n <= 1) 
        return false;
    if (n == 2 || n == 3) 
        return true;
    if (n % 2 == 0 || n % 3 == 0) 
        return false;

    for (long long i = 5; i * i <= n; i += 6) 
    {
        if (n % i == 0 || n % (i + 2) == 0)
            return false;
    }

    return true;
}

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long n;
        cin >> n;

        long long a = (long long) sqrt(n);

        if (a * a == n && isPrime(a))
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
