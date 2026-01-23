#include <bits/stdc++.h>
using namespace std;

const long long MOD = 1000000007;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        cin >> n;

        vector<int> a(n), b(n);
        for (int i = 0; i < n; i++) 
            cin >> a[i];
        for (int i = 0; i < n; i++) 
            cin >> b[i];

        sort(a.begin(), a.end());
        sort(b.begin(), b.end());

        long long ans = 1;
        int j = 0;

        for (int i = 0; i < n; i++) 
        {
            while (j < n && b[j] < a[i])
                j++;
        
            ans = (ans * (j - i)) % MOD;
        }

        cout << ans << "\n";
    }

    return 0;
}
