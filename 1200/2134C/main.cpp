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
        vector<long long> a(n);

        for (int i = 0; i < n; i++)
            cin >> a[i];

        long long res = 0;
        for (int i = 1; i < n - 1; i += 2) 
        {
            if (a[i] >= a[i - 1] + a[i + 1]) 
                continue;

            long long diff = (a[i - 1] + a[i + 1]) - a[i];

            if (a[i + 1] >= diff) {
                a[i + 1] -= diff;
            } else {
                long long temp = diff - a[i + 1];
                a[i + 1] = 0;
                a[i - 1] -= temp;
            }

            res += diff;
        }

        if (n % 2 == 0 && a[n - 1] < a[n - 2]) {
            res += a[n - 2] - a[n - 1];
        }

        cout << res << "\n";
    }

    return 0;
}
