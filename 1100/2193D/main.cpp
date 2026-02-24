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

        vector<long long> a(n);
        for (int i = 0; i < n; i++)
            cin >> a[i];

        vector<int> b(n);
        for (int i = 0; i < n; i++)
            cin >> b[i];

        sort(a.begin(), a.end());

        long long maxScore = 0;
        int used = 0;

        for (int i = 0; i < n; i++) 
        {
            used += b[i];

            if (used > n) 
                break;

            long long diff = a[n - used];
            long long score = diff * (i + 1);

            maxScore = max(maxScore, score);
        }

        cout << maxScore << "\n";
    }

    return 0;
}
