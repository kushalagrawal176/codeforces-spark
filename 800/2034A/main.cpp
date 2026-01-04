#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int t;
    cin>>t;
    
    while(t--)
    {
        int a,b;
        cin>>a>>b;
        
        int ans = min(a,b);
        while(ans%a != ans%b)
        {
            ans++;
        }
        
        cout<<ans<<endl;
    }
    
    return 0;
}