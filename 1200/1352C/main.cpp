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

        long long low = 1;
        long long high = k * n;

        while (low <= high) 
        {
            long long mid = low + (high - low) / 2;

            // Count of numbers <= mid that are not divisible by n
            if (mid - (mid / n) >= k)
                high = mid - 1;
            else
                low = mid + 1;
        }

        cout << low << "\n";
    }

    return 0;
}
