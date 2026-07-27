#include<bits/stdc++.h>
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

    while (t-- > 0) 
    {
        long long a, b, c;
        cin >> a >> b >> c;

        long long d = gcd(a, gcd(b, c));

        if (a / d + b / d + c / d <= 6)
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}