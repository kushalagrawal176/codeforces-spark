#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int t;
    cin>>t;
    
    while(t--)
    {
        long long n;
        cin>>n;
        
        long long ans = 0;
        
        ans = ans + (n/15)*3 + 1;
        n = n - 15*(n/15);
        
        if(n == 0)
        {}
        else if(n==1)
            ans = ans+1;
        else
            ans = ans+2;
            
        cout<<ans<<endl;
    }
    
    return 0;
}