#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long a, b, n;
        cin >> a >> b >> n;

        if (n * b <= a || b >= a)
            cout << 1 << "\n";
        else
            cout << 2 << "\n";
    }

    return 0;
}
