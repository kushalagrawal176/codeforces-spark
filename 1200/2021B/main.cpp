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

        vector<int> freq(n + 1, 0);
        for (int i = 0; i < n; i++) 
        {
            int a;
            cin >> a;

            if (a <= n)
                freq[a]++;
        }

        int ans = 0;
        for (; ans <= n; ans++) 
        {
            if (freq[ans] == 0) 
                break;

            int extra = freq[ans] - 1;
            if (ans + x <= n)
                freq[ans + x] += extra;
        }

        cout << ans << "\n";
    }

    return 0;
}
