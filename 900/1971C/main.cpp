#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int t;
    cin>>t;
    
    while(t--)
    {
        int a,b,c,d;
        cin>>a>>b>>c>>d;
        
        if(a<b)
            swap(a,b);
        if(c<d)
            swap(c,d);
        
        if((c>a && d>b && d<a) || (d<b && c<a && c>b))
            cout<<"YES"<<endl;
        else
            cout<<"NO"<<endl;
    }
    
    return 0;
}