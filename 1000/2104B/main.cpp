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

        for (int i = 0; i < n; i++)
            cin >> a[i];

        vector<long long> sum(n);
        vector<int> maxi(n);

        long long s = 0;
        for (int i = n - 1; i >= 0; i--)
        {
            s += a[i];
            sum[i] = s;
        }

        int m = a[0];
        for (int i = 0; i < n; i++) 
        {
            m = max(m, a[i]);
            maxi[i] = m;
        }

        for (int i = n - 1; i >= 0; i--)
            cout << sum[i] - a[i] + max(a[i], maxi[i]) << " ";

        cout << "\n";
    }

    return 0;
}
