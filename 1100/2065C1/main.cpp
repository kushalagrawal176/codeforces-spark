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

        vector<int> a(n);
        for (int i = 0; i < n; i++) 
            cin >> a[i];

        int b;
        cin >> b;

        for (int i = 0; i < n; i++) 
        {
            a[i] = min(a[i], b - a[i]);
            if (i != 0 && a[i] < a[i - 1]) 
                a[i] = b - a[i];
        }

        int l = 0;
        for (int i = 0; i < n - 1; i++) 
        {
            if (a[i] <= a[i + 1]) 
                l++;
        }

        cout << (l == n - 1 ? "YES" : "NO") << "\n";
    }

    return 0;
}
