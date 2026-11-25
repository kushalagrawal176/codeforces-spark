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

        vector<int> a(n);

        for(int i=0; i<n; i++)
            cin>>a[i];

        int diff = 0;
        for(int i=1; i<=n; i++)
            diff += abs(i-a[i-1]);

        if(a[0] == n && a[n - 1] == 1)
            cout<<3<<"\n";
        else if(diff == 0)
            cout<<0<<"\n";
        else if(a[0] == 1 || a[n - 1] == n)
            cout<<1<<"\n";
        else
            cout<<2<<"\n";
    }

    return 0;
}