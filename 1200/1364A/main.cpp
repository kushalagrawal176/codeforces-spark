#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, x;
        cin >> n >> x;

        long long s = 0;
        int cnt = -1;

        vector<int> arr(n);
        for (int i = 0; i < n; i++) 
        {
            cin >> arr[i];
            s += arr[i];

            if (s % x != 0)
                cnt = max(cnt, max(i + 1, n - i - 1));
        }

        cout << cnt << "\n";
    }

    return 0;
}
