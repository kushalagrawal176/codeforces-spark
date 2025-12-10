#include <bits/stdc++.h>
using namespace std;

int gcd(int a, int b) 
{
    while (b != 0) 
    {
        int t = a % b;
        a = b;
        b = t;
    }

    return a;
}

int main() 
{
    int t;
    cin >> t;
    while (t--) 
    {
        int n;
        cin >> n;
        vector<int> idx(1001, -1);

        for (int i = 1; i <= n; i++) 
        {
            int x;
            cin >> x;
            idx[x] = i; // store latest index of this value
        }

        int ans = -1;
        for (int i = 1; i <= 1000; i++) 
        {
            if (idx[i] == -1) 
                continue;
            for (int j = 1; j <= 1000; j++) 
            {
                if (idx[j] == -1) 
                    continue;
                if (gcd(i, j) == 1) 
                {
                    ans = max(ans, idx[i] + idx[j]);
                }
            }
        }

        cout << ans << "\n";
    }
    return 0;
}
