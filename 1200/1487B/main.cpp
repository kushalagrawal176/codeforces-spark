#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long n, k;
        cin >> n >> k;

        if (n % 2 == 0)
            cout << ((k % n == 0) ? n : k % n) << "\n";
        else 
        {
            long long extra = (k - 1) / (n / 2);
            cout << ((k + extra) % n == 0 ? n : (k + extra) % n) << "\n";
        }
    }

    return 0;
}
