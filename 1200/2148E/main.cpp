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

        vector<int> arr(n);
        vector<int> x(n + 1, 0);

        for (int i = 0; i < n; i++) 
        {
            cin >> arr[i];
            x[arr[i]]++;
        }

        bool valid = true;
        for (int i = 1; i <= n; i++) 
        {
            if (x[i] % k != 0) 
            {
                valid = false;
                break;
            }

            x[i] /= k;
        }

        if (!valid) 
        {
            cout << 0 << "\n";
            continue;
        }

        int i = 0, j = 0;
        vector<int> f(n + 1, 0);
        long long ans = 0;

        while (j < n) 
        {
            int el = arr[j];
            f[el]++;

            while (f[el] > x[el]) 
            {
                f[arr[i]]--;
                i++;
            }

            ans += (j - i + 1);
            j++;
        }

        cout << ans << "\n";
    }

    return 0;
}
