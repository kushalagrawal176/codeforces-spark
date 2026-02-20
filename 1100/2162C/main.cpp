#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int a, b;
        cin >> a >> b;

        if (b > a && (a ^ b) > a)
            cout << -1 << "\n";
        else if (a == b)
            cout << 0 << "\n";
        else if ((a ^ b) > a)
            cout << 2 << "\n" << b << " " << a << "\n";
        else
            cout << 1 << "\n" << (a ^ b) << "\n";
    }

    return 0;
}
