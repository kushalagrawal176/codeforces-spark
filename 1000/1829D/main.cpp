#include <bits/stdc++.h>
using namespace std;

bool solve(long long a, long long b, long long m) 
{
    if (a == m || b == m)
        return true;
    if (a % 3 != 0 && b % 3 != 0)
        return false;

    if (a % 3 == 0) 
    {
        if (solve(a / 3, 2 * (a / 3), m))
            return true;
    }

    if (b % 3 == 0) 
    {
        if (solve(b / 3, 2 * (b / 3), m))
            return true;
    }

    return false;
}

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long n, m;
        cin >> n >> m;

        if (n == m)
            cout << "YES\n";
        else if (n % 3 != 0)
            cout << "NO\n";
        else 
        {
            long long a = n / 3;
            if (solve(a, 2 * a, m))
                cout << "YES\n";
            else
                cout << "NO\n";
        }
    }

    return 0;
}
