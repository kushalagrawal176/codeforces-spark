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

        long long total = 0;
        vector<int> a(n), b(k);

        for (int i = 0; i < n; i++) 
        {
            cin >> a[i];
            total += a[i];
        }

        for (int i = 0; i < k; i++)
            cin >> b[i];

        sort(a.begin(), a.end());
        sort(b.begin(), b.end());

        int ptr = n - 1;
        long long free = 0;

        for (int x : b) 
        {
            if (ptr + 1 < x) 
                break;

            int idx = max(0, ptr - x + 1);
            free += a[idx];
            ptr = idx - 1;
        }

        cout << total - free << "\n";
    }

    return 0;
}
