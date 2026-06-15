#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, m, k;
        cin >> n >> m >> k;

        // Calculate the maximum number of elements per group
        // If n is not divisible by m, we need to account for the extra elements
        // This means we need one more group to accommodate the remaining elements
        // So we take the ceiling of n / m
        // This gives us the maximum number of elements that can be in each group
        int maxPerGroup = (n % m == 0) ? n / m : (n / m) + 1;

        if (k >= n - maxPerGroup)
            cout << "NO\n";
        else
            cout << "YES\n";
    }

    return 0;
}
