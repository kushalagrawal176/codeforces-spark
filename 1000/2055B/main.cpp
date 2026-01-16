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
            b[i] = a[i] - x;
        }

        sort(b.begin(), b.end());

        if (b[0] + b[1] >= 0)
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
