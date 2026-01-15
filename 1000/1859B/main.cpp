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

        long long ans = 0;
        long long amin = LLONG_MAX, bmin = LLONG_MAX;

        while (n--) 
        {
            int x;
            cin >> x;
            vector<int> a(x);

            for (int i = 0; i < x; i++)
                cin >> a[i];

            sort(a.begin(), a.end());

            // Add the second smallest element
            ans += a[1];

            // Track global minimums
            amin = min(amin, (long long)a[0]);
            bmin = min(bmin, (long long)a[1]);
        }

        cout << ans - bmin + amin << "\n";
    }

    return 0;
}
