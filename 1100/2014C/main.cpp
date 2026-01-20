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
        vector<int> a(n);
        long long sum = 0;

        for (int i = 0; i < n; i++) 
        {
            cin >> a[i];
            sum += a[i];
        }

        sort(a.begin(), a.end());

        int mid = a[n / 2];
        long long extra = 1LL * mid * n * 2 + 1;

        if (n <= 2)
            cout << -1 << "\n";
        else if (extra < sum)
            cout << 0 << "\n";
        else
            cout << extra - sum << "\n";
    }

    return 0;
}
