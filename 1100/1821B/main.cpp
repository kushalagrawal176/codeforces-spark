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
        for (int i = 0; i < n; i++) cin >> a[i];
        for (int i = 0; i < n; i++) cin >> b[i];

        int l = -1, r = -1;

        // Find first and last mismatch
        for (int i = 0; i < n; i++) 
        {
            if (a[i] != b[i]) 
            {
                if (l == -1) 
                    l = i;
                r = i;
            }
        }

        // Expand left boundary while non-decreasing
        while (l > 0 && b[l - 1] <= b[l])
            l--;

        // Expand right boundary while non-decreasing
        while (r < n - 1 && b[r] <= b[r + 1])
            r++;

        cout << (l + 1) << " " << (r + 1) << "\n";
    }

    return 0;
}
