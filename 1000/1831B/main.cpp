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

        for (int i = 0; i < n; i++) 
            cin >> a[i];
        for (int i = 0; i < n; i++) 
            cin >> b[i];

        vector<int> f1(2 * n + 1, 0), f2(2 * n + 1, 0);

        // Process array a
        int i = 0;
        while (i < n) 
        {
            int val = a[i];
            int cnt = 0;

            while (i < n && a[i] == val) 
            {
                cnt++;
                i++;
            }

            f1[val] = max(f1[val], cnt);
        }

        // Process array b
        i = 0;
        while (i < n) 
        {
            int val = b[i];
            int cnt = 0;

            while (i < n && b[i] == val) 
            {
                cnt++;
                i++;
            }

            f2[val] = max(f2[val], cnt);
        }

        int maxLen = 0;
        for (int j = 1; j <= 2 * n; j++)
            maxLen = max(maxLen, f1[j] + f2[j]);

        cout << maxLen << "\n";
    }

    return 0;
}
