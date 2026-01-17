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

        vector<int> a(n);
        for (int i = 0; i < n; i++)
            cin >> a[i];

        sort(a.begin(), a.end());

        int kk = (n - 1) % 2;
        long long al = 0, bo = 0;

        for (int i = n - 1; i >= 0; i--) 
        {
            if (i % 2 == kk)
                al += a[i];
            else 
            {
                int dif = min(a[i + 1] - a[i], k);
                k -= dif;
                bo += dif + a[i];
            }
        }

        cout << al - bo << "\n";
    }

    return 0;
}
