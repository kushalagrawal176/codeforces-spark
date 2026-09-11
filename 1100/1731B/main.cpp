#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        long long n;
        cin>>n;

        long long p = 1000000007;
        long long val = (__int128(337) * n % p * (n + 1) % p * (4 * n - 1) % p) % p;

        cout<<val<<"\n";
    }

    return 0;
}