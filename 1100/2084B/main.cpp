#include <bits/stdc++.h>
using namespace std;

long long gcd(long long a, long long b) 
{
    if (b == 0) 
        return a;

    return gcd(b, a % b);
}

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

        sort(a.begin(), a.end());

        long long g = 0;
        for (int i = 1; i < n; i++) 
        {
            if (a[i] % a[0] == 0)
                g = gcd(g, a[i]);
        }

        if (g == a[0])
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
