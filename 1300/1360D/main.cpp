#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long n, k;
        cin >> n >> k;

        long long ans = LLONG_MAX;
        for (long long i = 1; i * i <= n; i++) 
        {
            if (i > k) 
                break;
                
            if (n % i == 0) 
            {
                long long div = n / i;
                if (div <= k)
                    ans = min(ans, min(i, div));
                else
                    ans = min(ans, div);
            }
        }

        cout << ans << "\n";
    }

    return 0;
}
