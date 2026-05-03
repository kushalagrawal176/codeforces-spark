#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin>>t;

    while(t--)
    {
        int n,z=0,p;
        cin>>n;

        int s = n*(n+1)/2;
        vector<int> v(n);

        for(int i=0;i<n;i++)
        {
            cin>>v[i];
            s -= v[i];

            if(!v[i])
                z++,p=i;
        }

        if(z == 1)
            v[p] = s;

        int l = 0, r = n-1;

        while(l < n && v[l] == l+1)
            l++;
        while(r >= 0 && v[r] == r+1)
            r--;

        cout<<(r>l ? r-l+1 : 0)<<'\n';
    }

    return 0;
}