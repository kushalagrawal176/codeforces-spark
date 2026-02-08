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

        int i = 0;
        for (; i < n - 1; i++) 
        {
            if (a[i] > a[i + 1]) 
            {
                cout << "NO\n";
                break;
            }

            a[i + 1] -= a[i];
        }

        if (i == n - 1)
            cout << "YES\n";
    }

    return 0;
}
