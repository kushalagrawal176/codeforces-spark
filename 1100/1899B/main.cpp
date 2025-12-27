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

        vector<long long> prefix(n);
        cin >> prefix[0];

        for (int i = 1; i < n; i++) 
        {
            long long x;
            cin >> x;

            prefix[i] = prefix[i - 1] + x;
        }

        // Find all divisors of n 
        vector<int> factors;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) factors.push_back(i);

        long long maxi = LLONG_MIN;

        for (int k : factors) 
        {
            long long mi = LLONG_MAX;
            long long ma = LLONG_MIN;
            
            // Calculate sums of segments of length k
            // and find the maximum and minimum segment sums
            for (int j = 1; j <= n / k; j++) 
            {
                int endIndex = k * j - 1;
                int startIndex = k * (j - 1) - 1;
            
                long long segmentSum = prefix[endIndex] - (startIndex >= 0 ? prefix[startIndex] : 0);

                ma = max(ma, segmentSum);
                mi = min(mi, segmentSum);
            }

            maxi = max(maxi, ma - mi);
        }

        cout << maxi << "\n";
    }

    return 0;
}
