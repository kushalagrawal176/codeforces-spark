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
    long long w, h, d, n;
    cin >> w >> h >> d >> n;

    long long cnt = n;
    long long a = gcd(w, cnt);
    cnt /= a;

    long long b = gcd(h, cnt);
    cnt /= b;

    long long c = gcd(d, cnt);
    cnt /= c;

    if (cnt != 1)
        cout << -1 << "\n";
    else
        cout << (a - 1) << " " << (b - 1) << " " << (c - 1) << "\n";

    return 0;
}
