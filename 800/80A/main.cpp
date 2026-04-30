#include <bits/stdc++.h>
using namespace std;

bool isPrime(int x) 
{
    if (x < 2) 
        return false;

    for (int i = 2; i * i <= x; i++) 
    {
        if (x % i == 0) 
            return false;
    }

    return true;
}

int nextPrime(int x) 
{
    int candidate = x + 1;
    while (!isPrime(candidate)) 
    {
        candidate++;
    }

    return candidate;
}

int main() 
{
    int n, m;
    cin >> n >> m;

    if (nextPrime(n) == m) 
        cout << "YES\n";
    else
        cout << "NO\n";

    return 0;
}
