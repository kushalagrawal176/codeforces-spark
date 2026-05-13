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

        long long evenSum = 0;
        vector<long long> odd;

        for (int i = 0; i < n; i++) 
        {
            long long x;
            cin >> x;
            if ((x & 1) == 0)
                evenSum += x;
            else
                odd.push_back(x);
        }

        if (odd.empty()) 
        {
            cout << 0 << "\n";
            continue;
        }

        sort(odd.begin(), odd.end());

        int k = odd.size();
        int take = (k + 1) / 2;
        long long ans = evenSum;

        for (int i = 0; i < take; i++)
            ans += odd[k - 1 - i];

        cout << ans << "\n";
    }

    return 0;
}
