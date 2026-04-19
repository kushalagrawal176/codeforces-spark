#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long p, q;
        cin >> p >> q;

        if (3 * p < 2 * q || p >= q)
            cout << "Alice\n";
        else
            cout << "Bob\n";
    }

    return 0;
}
