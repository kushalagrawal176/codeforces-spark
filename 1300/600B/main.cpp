#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n, m;
    cin >> n >> m;

    vector<int> a(n);
    for (int i = 0; i < n; i++)
        cin >> a[i];

    sort(a.begin(), a.end());

    while (m--) 
    {
        int x;
        cin >> x;

        // Binary search: upper_bound returns iterator to first element > x
        int ans = upper_bound(a.begin(), a.end(), x) - a.begin();
        cout << ans << " ";
    }

    return 0;
}
