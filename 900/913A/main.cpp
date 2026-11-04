#include<bits/stdc++.h>
using namespace std;

int main() 
{
    long long n, m;
    cin>>n>>m;

    // If n is large, 2^n > m, so m % (2^n) is just m.
    // This also prevents overflow/undefined behavior with large bit shifts.
    if(n >= 30) 
        cout<<m<<"\n";
    else 
    {
        long long mod = 1LL << n;
        cout<<m % mod<<"\n";
    }
    
    return 0;
}