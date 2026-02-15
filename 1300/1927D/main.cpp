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
        for (int j = 0; j < n; j++)
            cin >> a[j];

        vector<int> ans(n, INT_MAX);

        int i = 0, j = 0;
        while (j < n) 
        {
            if (a[i] == a[j])
                j++;
            else
            {
                ans[i] = j + 1; // store 1-based index
                i++;
            }
        }

        int q;
        cin >> q;
        while (q--) 
        {
            int l, r;
            cin >> l >> r;

            if (ans[l - 1] <= r)
                cout << l << " " << ans[l - 1] << "\n";
            else
                cout << -1 << " " << -1 << "\n";
        }
    }

    return 0;
}
