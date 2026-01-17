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
        vector<int> a(n);

        for (int i = 0; i < n; i++)
            cin >> a[i];

        int alice = 0;
        int bob = n - 1;

        long long a_weight = a[0];
        long long b_weight = a[n - 1];

        int cnt = 0;

        while (alice < bob) 
        {
            if (a_weight == b_weight)
                cnt = max(cnt, (alice + 1) + (n - bob));
            if (a_weight <= b_weight) 
            {
                alice++;
                a_weight += a[alice];
            } 
            else 
            {
                bob--;
                b_weight += a[bob];
            }
        }

        cout << cnt << "\n";
    }

    return 0;
}
