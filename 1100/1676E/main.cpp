#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, q;
        cin >> n >> q;

        vector<int> a(n);
        for (int i = 0; i < n; i++) 
        {
            cin >> a[i];
        }

        // Sort in descending order
        sort(a.begin(), a.end(), greater<int>());

        // Prefix sums
        for (int i = 1; i < n; i++) 
        {
            a[i] += a[i - 1];
        }

        while (q--) 
        {
            int val;
            cin >> val;

            int ans = -1;
            int low = 0, high = n - 1;

            while (low <= high) 
            {
                int mid = low + (high - low) / 2;

                if (a[mid] >= val) 
                {
                    ans = mid + 1;   // +1 because we need count of elements
                    high = mid - 1;
                } 
                else 
                {
                    low = mid + 1;
                }
            }

            cout << ans << "\n";
        }
    }

    return 0;
}
