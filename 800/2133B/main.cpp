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

        sort(a.begin(), a.end());

        long long ans = 0;
        int s = (n % 2 == 1) ? 0 : 1;

        for (int i = s; i < n; i += 2)
            ans += a[i];

        cout << ans << "\n";
    }

    return 0;
}
