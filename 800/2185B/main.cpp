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
        
        int maxi = INT_MIN;
        for(int i=1;i<=n;i++)
        {
            int a;
            cin>>a;
            
            maxi = max(maxi, a);
        }
        
        cout<<maxi*n<<endl;
    }
    
    return 0;
}