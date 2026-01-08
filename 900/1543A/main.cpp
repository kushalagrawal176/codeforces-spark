#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long a, b;
        cin >> a >> b;

        long long c = abs(a - b);
        cout << c;

        if (a == b)
            cout << " " << 0 << "\n";
        else
            cout << " " << min(a % c, c - a % c) << "\n";
    }

    return 0;
}
