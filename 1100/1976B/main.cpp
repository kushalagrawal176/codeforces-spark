#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        int n;
        cin>>n;

        vector<long long> a(n);
        vector<long long> b(n + 1);

        for(int i=0; i<n; i++)
            cin>>a[i];

        for(int i=0; i<n+1; i++)
            cin>>b[i];

        long long sum = 0;
        long long e = 2e18; // Equivalent to Infinity for long long

        for(int i=0; i<n; i++) 
        {
            sum += abs(a[i] - b[i]);
            
            // Check the minimum distance from b[n] to the range/elements of a[i] and b[i]
            e = min(e, min(abs(a[i] - b[n]), abs(b[i] - b[n])));

            if(min(a[i], b[i]) <= b[n] && b[n] <= max(a[i], b[i]))
                e = 0;
        }

        cout<<sum + e + 1<<"\n";
    }

    return 0;
}