#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        long long n, k, a, b;
        cin>>n>>k>>a>>b;

        vector<long long> x(n + 1);
        vector<long long> y(n + 1);

        for(int i = 1; i <= n; i++)
            cin>>x[i]>>y[i];

        // Direct distance from a to b
        long long p = abs(x[a] - x[b]) + abs(y[a] - y[b]);

        long long u = LLONG_MAX / 2;
        long long v = LLONG_MAX / 2;

        // Find minimum distance from a and b to any major city (1 to k)
        for(int i=1; i<=k; i++) 
        {
            u = min(u, abs(x[a] - x[i]) + abs(y[a] - y[i]));
            v = min(v, abs(x[b] - x[i]) + abs(y[b] - y[i]));
        }

        // Output the minimum of direct distance vs traveling via major cities
        cout<<min(p, u + v)<<"\n";
    }

    return 0;
}