#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, k;
        cin >> n >> k;

        vector<long long> a(n * k);
        for (int i = 0; i < n * k; i++) 
            cin >> a[i];

        long long sum = 0;
        // Pick medians from the end
        for (int i = 1; i <= k; i++) 
            sum += a[n * k - i * (n / 2 + 1)];

        cout << sum << "\n";
    }

    return 0;
}
