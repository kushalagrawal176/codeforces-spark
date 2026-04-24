#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        long long k;
        cin >> n >> k;

        vector<array<long long, 3>> arr(n);

        for (int i = 0; i < n; i++)
            cin >> arr[i][0] >> arr[i][1] >> arr[i][2];

        // Sort by the first element (start time)
        sort(arr.begin(), arr.end(), [](auto &a, auto &b) {
            return a[0] < b[0];
        });

        for (int i = 0; i < n; i++) 
        {
            if (arr[i][0] <= k && k <= arr[i][1] && arr[i][2] > k)
                k = arr[i][2];
        }

        cout << k << "\n";
    }

    return 0;
}
