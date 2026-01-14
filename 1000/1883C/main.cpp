#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, k;
        cin >> n >> k;

        int res = INT_MAX;
        int evenCount = 0;

        for (int i = 0; i < n; i++) 
        {
            int val;
            cin >> val;

            if (val % 2 == 0)
                evenCount++;

            int cur = (val % k == 0) ? 0 : k - (val % k);
            res = min(res, cur);
        }

        if (k == 4)
            res = min(res, max(0, 2 - evenCount));

        cout << res << "\n";
    }

    return 0;
}
