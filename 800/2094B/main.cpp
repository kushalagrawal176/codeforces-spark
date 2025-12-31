#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int t;
    cin>>t;
    
    while(t--)
    {
        int n,m,l,r;
        cin>>n>>m>>l>>r;
        
        if(0+m <= r)
            cout<<0<<" "<<m<<endl;
        else if(0+m > r)
            cout<<(r-m)<<" "<<r<<endl;
        else if(0-m >= l)
            cout<<0-m<<" "<<0<<endl;
        else
        {}
    }
    
    return 0;
}