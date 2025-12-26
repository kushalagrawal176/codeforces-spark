#include <bits/stdc++.h>
using namespace std;

long long gcd(long long a, long long b) 
{
    while (b != 0) 
    {
        long long t = a % b;
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
        vector<long long> a(n);

        for (int i = 0; i < n; i++)
            cin >> a[i];

        // Compute gcd of even-index and odd-index groups
        long long g_even = 0, g_odd = 0;
        for (int i = 0; i < n; i++) 
        {
            if (i % 2 == 0)
                g_even = gcd(g_even, a[i]);
            else
                g_odd = gcd(g_odd, a[i]);
        }

        // Check if g_even is a valid answer
        bool flag1 = true;
        for (int i = 1; i < n; i += 2) 
        {
            if (a[i] % g_even == 0) 
            {
                flag1 = false;
                break;
            }
        }

        // Check if g_odd is a valid answer
        bool flag2 = true;
        for (int i = 0; i < n; i += 2) 
        {
            if (a[i] % g_odd == 0) 
            {
                flag2 = false;
                break;
            }
        }

        long long ans = 0;
        if (flag1 && g_even > 0)
            ans = g_even;
        if (flag2 && g_odd > ans)
            ans = g_odd;

        cout << ans << "\n";
    }

    return 0;
}
