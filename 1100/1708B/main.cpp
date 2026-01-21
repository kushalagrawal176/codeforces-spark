#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        long long l, r;
        cin >> n >> l >> r;

        vector<long long> a(n);
        bool flag = true;

        for (int i = 1; i <= n; i++) 
        {
            if (l % i == 0)
                a[i - 1] = l;
            else 
            {
                long long val = (l / i + 1) * i;

                if (val > r) 
                {
                    flag = false;
                    break;
                }

                a[i - 1] = val;
            }
        }

        if (!flag)
            cout << "NO\n";
        else 
        {
            cout << "YES\n";
            for (int i = 0; i < n; i++)
                cout << a[i] << " ";
            
            cout << "\n";
        }
    }

    return 0;
}
