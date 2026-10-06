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

        long long a = 0;
        long long sol = LLONG_MAX;

        for(int i=1; i<=n; i++) 
        {
            long long x;
            cin>>x;
            a += x;

            long long cur = a / i;
            sol = min(sol, cur);

            cout<<sol<<" ";
        }

        cout<<"\n";
    }

    return 0;
}