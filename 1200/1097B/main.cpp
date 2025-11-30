#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin >> n;

    vector<int> a(n);
    for (int i = 0; i < n; i++) 
    {
        cin >> a[i];
    }

    vector<bool> dp(360, false);
    dp[0] = true;

    for (int angle : a) 
    {
        vector<bool> next(360, false);
        for (int pos = 0; pos < 360; pos++) 
        {
            if (dp[pos]) 
            {
                next[(pos + angle) % 360] = true;
                next[(pos - angle + 360) % 360] = true;
            }
        }
        dp = next;
    }

    cout << (dp[0] ? "YES" : "NO") << endl;
    return 0;
}
