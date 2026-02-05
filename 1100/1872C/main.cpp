#include <bits/stdc++.h>
using namespace std;

int isPrime(int a) 
{
    for (int i = 2; i <= sqrt(a); i++) 
    {
        if (a % i == 0)
            return i;
    }

    return -1;
}

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int l, r;
        cin >> l >> r;

        if (r <= 3)
            cout << -1 << "\n";
        else 
        {
            if (l == r && isPrime(r) == -1)
                cout << -1 << "\n";
            else 
            {
                if (isPrime(r) == -1) 
                {
                    int a = isPrime(r - 1);
                    cout << a << " " << (r - 1 - a) << "\n";
                } 
                else
                {
                    int a = isPrime(r);
                    cout << a << " " << (r - a) << "\n";
                }
            }
        }
    }

    return 0;
}
