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
        
        vector<int> ans(n);
        int c = 1;
        for(int i=0;i<n/2;i++)
        {
            ans[i] = c;
            ans[n-i-1] = c+1;
            c++;
            c++;
        }
        
        if((n&1) == 1)
            ans[n/2] = n;
        for(int i=0;i<n;i++)
            cout<<ans[i]<<" ";
            
        cout<<endl;
    }
    
    return 0;
}