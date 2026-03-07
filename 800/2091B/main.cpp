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

        vector<long long> arr(n);
        for (int i = 0; i < n; i++)
            cin >> arr[i];

        sort(arr.rbegin(), arr.rend()); // sort in descending order

        int ans = 0;
        int j = 0;

        for (int i = 0; i < n; i++) 
        {
            j++;
            if (arr[i] * j >= x) 
            {
                ans++;
                j = 0;
            }
        }

        cout << ans << "\n";
    }

    return 0;
}
