#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, q;
        cin >> n >> q;

        vector<int> a(n), b(n);
        b[0] = 0;
        cin >> a[0];

        for (int i = 1; i < n; i++) 
        {
            cin >> a[i];
            b[i] = b[i - 1];

            if (a[i - 1] % 2 == 1)
                b[i] = b[i] + 1;
        }

        int total = b[n - 1];
        if (a[n - 1] % 2 == 1)
            total++;

        while (q--) 
        {
            int l, r, k;
            cin >> l >> r >> k;

            int odd = b[r - 1] - b[l - 1];
            if (a[r - 1] % 2 == 1)
                odd++;

            if ((total - odd) % 2 == 1) 
            {
                if ((r - l + 1) % 2 == 1 && k % 2 == 1)
                    cout << "NO\n";
                else
                    cout << "YES\n";
            } 
            else 
            {
                if ((r - l + 1) % 2 == 1 && k % 2 == 1)
                    cout << "YES\n";
                else
                    cout << "NO\n";
            }
        }
    }

    return 0;
}
