#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int k, x;
        cin >> k >> x;

        long long n = x;
        while (k-- > 0) 
        {
            n = n * 2;
        }

        cout << n << "\n";
    }

    return 0;
}
