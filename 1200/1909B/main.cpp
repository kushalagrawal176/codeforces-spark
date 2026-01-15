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
        vector<long long> a(n);
        for (int i = 0; i < n; i++)
            cin >> a[i];

        long long ans = 1;
        bool flag = false;

        while (!flag) 
        {
            ans *= 2;
            unordered_set<long long> mod;

            for (int i = 0; i < n; i++)
                mod.insert(a[i] % ans);
            
            if (mod.size() == 2)
                flag = true;
        }

        cout << ans << "\n";
    }

    return 0;
}
