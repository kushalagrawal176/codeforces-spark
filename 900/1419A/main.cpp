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
        string r;
        cin>>r;

        int o = 0;
        int e = 0;

        for(int i=0; i<n; i++) 
        {
            int d = r[i] - '0';
            if(i%2 == 0) 
            {
                if(d%2 == 1)
                    o++;
            } 
            else 
            {
                if(d%2 == 0)
                    e++;
            }
        }

        if(n%2 == 1) 
        {
            if(o > 0)
                cout<<1<<"\n";
            else
                cout<<2<<"\n";
        } 
        else 
        {
            if(e > 0)
                cout<<2<<"\n";
            else
                cout<<1<<"\n";
        }
    }

    return 0;
}