#include<bits/stdc++.h>
using namespace std;

// Euclidean algorithm for GCD
long long gcd(long long a, long long b) 
{
    if (b == 0)
        return a;

    return gcd(b, a % b);
}

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        long long n;
        cin>>n;
        
        vector<long long> arr(n);
        long long sum = 0;

        for(int i = 0; i < n; i++) 
        {
            cin>>arr[i];
            sum += arr[i];
        }

        long long num = 0;
        long long max_gcd = -1;

        // Iterate through all possible prefix partitions (from 0 to n-2)
        for(int i = 0; i < n - 1; i++) 
        {
            num += arr[i];
            max_gcd = max(max_gcd, gcd(sum - num, num));
        }

        cout<<max_gcd<<"\n";
    }

    return 0;
}