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

        int sum = 0, j = 0, maxLength = -1;

        for (int i = 0; i < n; i++) 
        {
            sum += a[i];
            while (sum > k && j <= i) 
            {
                sum -= a[j];
                j++;
            }
            
            if (sum == k)
                maxLength = max(maxLength, i - j + 1);
        }

        int ans = (maxLength == -1) ? -1 : n - maxLength;
        cout << ans << "\n";
    }

    return 0;
}
