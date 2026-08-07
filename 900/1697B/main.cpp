#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int n, q;
    cin >> n >> q;

    vector<long long> a(n);
    for(int i = 0; i < n; i++)
        cin >> a[i];

    // Sort the array in ascending order
    sort(a.begin(), a.end());

    // Compute prefix sums
    for(int i = 1; i < n; i++)
        a[i] += a[i - 1];

    // Process queries
    while(q--) 
    {
        int x, y;
        cin >> x >> y;

        int s = n - x;
        int e = n - x + y - 1;

        long long ans = a[e] - ((s - 1 >= 0) ? a[s - 1] : 0);
        cout << ans << "\n";
    }

    return 0;
}