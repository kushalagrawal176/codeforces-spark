#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, m;
        cin >> n >> m;

        vector<long long> a(n);
        for (int i = 0; i < n; i++)
            cin >> a[i];

        int k = 31;
        while (m--) 
        {
            int x;
            cin >> x;

            if (x >= k) 
                continue;

            long long pow2x = 1LL << x;       // 2^x
            long long pow2x_1 = 1LL << (x-1); // 2^(x-1)

            for (int i = 0; i < n; i++) 
            {
                if (a[i] % pow2x == 0)
                    a[i] += pow2x_1;
            }

            k = x;
        }

        for (int i = 0; i < n; i++) 
            cout << a[i] << " ";
        
        cout << "\n";
    }

    return 0;
}
