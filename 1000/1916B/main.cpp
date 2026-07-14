#include<bits/stdc++.h>
using namespace std;

// Helper function to find the Greatest Common Divisor (GCD)
long long gcd(long long a, long long b) 
{
    while (b != 0) 
    {
        long long temp = a % b;
        a = b;
        b = temp;
    }

    return a;
}

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long x, y;
        cin >> x >> y;

        long long g = gcd(x, y);
        long long lcm = (x / g) * y;

        if (y % x == 0)
            cout << y * (y / x) << "\n";
        else
            cout << lcm << "\n";
    }

    return 0;
}