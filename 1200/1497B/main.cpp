#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, m;
        cin >> n >> m;

        vector<int> rem(m, 0);
        for (int i = 0; i < n; i++) 
        {
            int a;
            cin >> a;

            rem[a % m]++;
        }

        long long cnt = 0;
        if (rem[0] > 0) cnt++;

        for (int i = 1; i < m; i++) 
        {
            int j = m - i;
            if (rem[i] == 0) 
                continue;

            if (i == j) 
            { 
                // Special case when i == j (like m=6, i=3, j=3)
                cnt++;
                rem[i] = 0;
                continue;
            }

            if (rem[j] == 0)
                cnt += rem[i];
            else if (abs(rem[i] - rem[j]) <= 1)
                cnt++;
            else
                cnt += abs(rem[i] - rem[j]);

            rem[j] = 0;
        }

        cout << cnt << "\n";
    }

    return 0;
}
