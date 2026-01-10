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

        long long sum1 = 0, sum2 = 0;

        for (int i = 0; i < n; i++) 
        {
            int a;
            cin >> a;
            sum1 += a;

            sum2 += a / x;
            if (a % x != 0) 
                sum2++;
        }

        // Compute minimum possible sum (ceil(sum1 / x))
        long long minSum;
        if (sum1 % x != 0)
            minSum = sum1 / x + 1;
        else
            minSum = sum1 / x;

        cout << minSum << " " << sum2 << "\n";
    }

    return 0;
}
