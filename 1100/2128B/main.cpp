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

        vector<int> arr(n);
        for (int i = 0; i < n; i++)
            cin >> arr[i];

        int p = 0;
        string ans = "";

        for (int l = 0, r = n - 1; l < r; l++, r--) 
        {
            if (p % 2 == 0)
                ans += (arr[l] > arr[r] ? "LR" : "RL");
            else
                ans += (arr[l] > arr[r] ? "RL" : "LR");
                
            p++;
        }

        if (n % 2 == 1)
            ans += 'L';

        cout << ans << "\n";
    }

    return 0;
}
