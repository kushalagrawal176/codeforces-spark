#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long n, k, x;
        cin >> n >> k >> x;

        // Minimum possible sum: 1 + 2 + ... + k = k*(k+1)/2
        long long minSum = (k * (k + 1)) / 2;

        // Maximum possible sum: n + (n-1) + ... + (n-k+1)
        // Formula: k * (n + (n - k + 1)) / 2
        long long maxSum = (k * (n + (n - k + 1))) / 2;

        if (minSum > x || maxSum < x)
            cout << "NO\n";
        else
            cout << "YES\n";
    }

    return 0;
}
