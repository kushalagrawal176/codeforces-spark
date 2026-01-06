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

        vector<int> a(n);
        for (int i = 0; i < n; i++)
            cin >> a[i];

        sort(a.begin(), a.end());

        int cnt = 1, ans = 1;
        for (int i = 0; i < n - 1; i++) 
        {
            if (a[i + 1] - a[i] <= k)
                cnt++;
            else
                cnt = 1;
        
            ans = max(ans, cnt);
        }

        cout << (n - ans) << "\n";
    }

    return 0;
}
