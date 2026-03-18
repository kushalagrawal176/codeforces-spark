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

        int maxi = a[0];
        for (int i = 1; i < n; i++) 
        {
            maxi = max(maxi, a[i]);
            if (i % 2 == 1) 
            { 
                // even positions in 1-based indexing
                a[i] = maxi;
            }
        }

        long long cnt = 0;
        for (int i = 0; i < n; i++) 
        {
            if (i % 2 == 1) 
                continue; // skip odd indices (0-based)

            if (i + 1 < n) 
            {
                if (a[i] >= a[i + 1]) 
                {
                    cnt += a[i] - a[i + 1] + 1;
                    a[i] -= (a[i] - a[i + 1] + 1);
                }
            }

            if (i - 1 >= 0) 
            {
                if (a[i] >= a[i - 1])
                    cnt += a[i] - a[i - 1] + 1;
            }
        }

        cout << cnt << "\n";
    }

    return 0;
}
