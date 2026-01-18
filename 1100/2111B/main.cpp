#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int t;
    cin>>t;
    
    while(t--)
    {
        int n,m;
        cin>>n>>m;
        
        vector<int> a = {1,2,3,5,8,13,21,34,55,89};
        
        string ans = "";
        while(m--)
        {
            int b,c,d;
            cin>>b>>c>>d;
            
            if(n == 1)
                ans += "1";
            else if(min(b,min(c,d)) >= a[n-1])
            {
                if(a[n-1]+a[n-2] <= max(b,max(c,d)))
                    ans += "1";
                else
                    ans += "0";
            }
            else
                ans += "0";
        }
        
        cout<<ans<<endl;
    }
    
    return 0;
}