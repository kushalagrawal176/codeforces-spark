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
        
        if(a+b == c-b && a+b == d-c)
            cout<<3<<endl;
        else if(a+b == c-b || a+b == d-c || c-b == d-c)
            cout<<2<<endl;
        else
            cout<<1<<endl;
    }
    
    return 0;
}