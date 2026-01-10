#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        long long x;
        cin >> n >> x;

        vector<long long> a(n);
        for (int i = 0; i < n; i++)
            cin >> a[i];

        // Sort in descending order
        sort(a.rbegin(), a.rend());

        long long sum = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) 
        {
            sum += a[i];
            if (sum / (i + 1) >= x)
                cnt++;
            else
                break;
        }

        cout << cnt << "\n";
    }

    return 0;
}
