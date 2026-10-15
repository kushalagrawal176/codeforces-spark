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
        vector<long long> b(n);

        long long ans = 0;

        for(int i=0; i<n; i++) 
        {
            cin>>a[i];
            ans += a[i];
        }

        long long max_strength = 0;

        for(int i=0; i<n; i++) 
        {
            cin>>b[i];

            max_strength = max(max_strength, b[i]);
            ans += b[i];
        }

        cout<<ans - max_strength<<"\n";
    }

    return 0;
}