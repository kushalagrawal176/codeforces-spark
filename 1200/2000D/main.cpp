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

        vector<long long> a(n + 1, 0);
        for (int i = 1; i <= n; i++) 
        {
            int x;
            cin >> x;

            a[i] = a[i - 1] + x;
        }

        string s;
        cin >> s;

        long long sum = 0;
        int l = 0, r = n - 1;

        while (l < r) 
        {
            while (l < r && s[l] == 'R') 
                l++;
            while (l < r && s[r] == 'L') 
                r--;

            if (l < r)
                sum += a[r + 1] - a[l];

            l++;
            r--;
        }

        cout << sum << "\n";
    }

    return 0;
}
