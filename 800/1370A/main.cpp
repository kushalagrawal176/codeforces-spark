#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        cin >> n;

        // The maximum GCD of any pair (i, j) with 1 <= i, j <= n
        // is simply n/2.
        cout << n / 2 << "\n";
    }

    return 0;
}
