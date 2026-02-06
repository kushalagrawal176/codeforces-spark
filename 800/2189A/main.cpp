#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int t;
    cin>>t;
    
    while(t--)
    {
        int n,h,l;
        cin>>n>>h>>l;
        
        int less = 0;
        int more = 0;
        
        for(int i=0;i<n;i++)
        {
            int a;
            cin>>a;
            
            if(a <= min(h, l))
                less++;
            else if(a <= max(h, l))
                more++;
            else
            {}
        }
        
        cout<<(less+min(less, more))/2<<endl;
    }
    
    return 0;
}