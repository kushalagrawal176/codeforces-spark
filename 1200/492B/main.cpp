#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    long long l;
    cin >> n >> l;

    vector<long long> a(n);
    for (int i = 0; i < n; i++)
        cin >> a[i];

    sort(a.begin(), a.end());

    double ans = 0.0;

    // Distance from the first lantern to the start (0)
    ans = max(ans, (double)(a[0] - 0));

    // Distance from the last lantern to the end (l)
    ans = max(ans, (double)(l - a[n - 1]));

    // Maximum half-gap between consecutive lanterns
    for (int i = 0; i < n - 1; i++)
        ans = max(ans, (a[i + 1] - a[i]) / 2.0);

    cout << fixed << setprecision(10) << ans << endl;

    return 0;
}
