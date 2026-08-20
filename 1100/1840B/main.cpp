#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while(t--) 
    {
        long long n, k;
        cin >> n >> k;

        // If 2^k is greater than n+1, the answer is n+1.
        // We use 1LL << k to calculate 2^k safely for k up to 60.
        // If k >= 30 (since n <= 10^9), 2^k is definitely > n, 
        // so we cap k at 30 to prevent overflow of the bit shift.
        long long limit;
        if (k >= 30)
            limit = n + 1; // Any large k makes 2^k > n
        else
            limit = (1LL << k);

        cout<<min(n + 1, limit)<<"\n";
    }

    return 0;
}