#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin>>t;
    
    while(t--)
    {
        long long x,y;
        cin>>x>>y;
        
        long long a,b;
        cin>>a>>b;
        
        if(x == y)
            cout<<min(x*b, (x+y)*a)<<endl;
        else if(x > y)
            cout<<min(y*b+(x-y)*a, (x+y)*a)<<endl;
        else
            cout<<min(x*b+(y-x)*a, (x+y)*a)<<endl;
    }
    
    return 0;
}