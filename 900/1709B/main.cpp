#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int n, m;
    cin>>n>>m;

    vector<long long> a(n);
    for(int i=0; i<n; i++)
        cin>>a[i];

    vector<long long> pre(n+1, 0);
    vector<long long> suff(n+1, 0);

    for(int i=1; i<n; i++)
        pre[i+1] = pre[i] + max(0LL, a[i-1]-a[i]);

    for(int i=n-2; i>=0; i--)
        suff[i+1] = suff[i+2] + max(0LL, a[i+1]-a[i]);

    while(m--) 
    {
        int l, r;
        cin>>l>>r;

        if(l < r)
            cout<<(pre[r] - pre[l])<<'\n';
        else
            cout<<(suff[r] - suff[l])<<'\n';
    }

    return 0;
}