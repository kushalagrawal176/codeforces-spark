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

        vector<pair<long long, int>> v(n);
        for(int i=0; i<n; i++) 
        {
            cin>>v[i].first;
            v[i].second = i;
        }

        sort(v.begin(), v.end());

        vector<long long> p(n);
        p[0] = v[0].first;
        for(int i=1; i<n; i++)
            p[i] = p[i-1] + v[i].first;

        vector<long long> a(n);
        a[v[n-1].second] = n-1;

        for(int i=n-2; i>=0; i--) 
        {
            if (p[i] >= v[i + 1].first)
                a[v[i].second] = a[v[i+1].second];
            else
                a[v[i].second] = i;
        }

        for(int i=0; i<n; i++)
            cout<<a[i]<<(i == n-1 ? "\n" : " ");
    }
    
    return 0;
}