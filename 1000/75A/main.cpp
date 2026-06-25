#include <bits/stdc++.h>
using namespace std;

int removeZero(int n) 
{
    int d = 0;
    int t = 1;

    while (n > 0) 
    {
        int r = n % 10;
        n /= 10;

        if (r > 0) 
        {
            d += t * r;
            t *= 10;
        }
    }

    return d;
}

int main() 
{
    int a, b;
    cin >> a >> b;

    int c = a + b;

    a = removeZero(a);
    b = removeZero(b);
    c = removeZero(c);

    cout << ((a + b == c) ? "YES" : "NO") << endl;

    return 0;
}
