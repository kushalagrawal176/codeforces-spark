#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int t;
    cin>>t;
    
    while(t-- > 0)
    {
        int sum = 0;
        int maxi = -100;
        
        for(int i=0;i<7;i++)
        {
            int a;
            cin>>a;
 
            maxi = max(maxi, a);
            
            sum -= a;
        }
        
        cout<<sum + 2*maxi<<endl;;
    }
    
    return 0;
}