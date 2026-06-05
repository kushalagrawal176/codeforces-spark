#include <bits/stdc++.h>
using namespace std;

bool isPrime(long long n) 
{
    if (n < 2) 
        return false;

    for (long long i = 2; i * i <= n; i++) 
    {
        if (n % i == 0)
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
        int k;
        cin >> n >> k;

        bool prime = isPrime(n);

        if (!prime)
            cout << "NO\n";
        else 
        {
            if (n == 1) 
            {
                if (k == 2)
                    cout << "YES\n";
                else
                    cout << "NO\n";
            } 
            else
            {
                if (k == 1)
                    cout << "YES\n";
                else
                    cout << "NO\n";
            }
        }
    }

    return 0;
}
