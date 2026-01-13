#include <bits/stdc++.h>
using namespace std;
 
int main() 
{
    int n, m, f;
    cin >> n >> m;

    if (m > n)
        f = -1 ;
    else 
    {
        f = (n+1) /2;

        while (f % m != 0)
            f++;
    }

    cout << f;

    return 0;
}