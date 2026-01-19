#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin >> n;

    vector<int> a(n);
    cin >> a[0];
    for (int i = 1; i < n; i++) 
    {
        int x;
        cin >> x;
        a[i] = a[i - 1] + x;  // prefix sums
    }

    int m;
    cin >> m;
    while (m--) 
    {
        int t;
        cin >> t;

        // Find the first pile whose cumulative worms >= t
        int idx = lower_bound(a.begin(), a.end(), t) - a.begin();
        cout << idx + 1 << "\n";  // +1 because piles are 1-indexed
    }

    return 0;
}
