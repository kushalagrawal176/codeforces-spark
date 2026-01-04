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

        vector<int> a(n), b(n);

        for (int i = 0; i < n; i++)
            cin >> a[i];

        for (int i = 0; i < n; i++) 
        {
            int x;
            cin >> x;
            b[i] = x - a[i];  // store b[i] - a[i]
        }

        sort(b.begin(), b.end());

        int l = 0, r = n - 1;
        int cnt = 0;

        while (l < r) 
        {
            if (b[l] + b[r] >= 0) 
            {
                cnt++;
                r--;
            }
            l++;
        }

        cout << cnt << "\n";
    }

    return 0;
}
