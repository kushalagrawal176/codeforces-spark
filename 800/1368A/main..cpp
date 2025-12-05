#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t; // number of test cases

    while (t--) 
    {
        long long a, b, n;
        cin >> a >> b >> n; // input values

        long long cnt = 0;

        // Keep adding until one of them exceeds n
        while (!(a > n || b > n)) 
        {
            if (a < b)
                a = a + b;
            else
                b = a + b;
            cnt++;
        }

        cout << cnt << "\n"; // print the number of operations
    }

    return 0;
}
