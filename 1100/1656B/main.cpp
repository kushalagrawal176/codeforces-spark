#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        int n;
        long long k;
        cin>>n>>k;

        unordered_set<long long> s;
        vector<long long> a(n);

        for(int i=0; i<n; i++) 
        {
            cin>>a[i];
            s.insert(a[i]);
        }

        bool res = false;
        for(int i=0; i<n; i++) 
        {
            long long x = a[i] - k;
            if(s.count(x))
                res = true;
        }

        if(res)
            cout<<"Yes\n";
        else
            cout<<"No\n";
    }

    return 0;
}