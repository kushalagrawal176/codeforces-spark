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
        
        vector<int> a(n);
        int ptr = 1;
        
        int i = n-1;
        for(int i=n-1;i>=0;i-=2)
        {
            a[i] = ptr;
            ptr++;
        }
        
        if((n&1) == 1)
            i = 1;
        else
            i = 0;
            
        for(;i<n;i+=2)
        {
            a[i] = ptr;
            ptr++;
        }
        
        for(int i=0;i<n;i++)
            cout<<a[i]<<" ";
        
        cout<<endl;
    }
    
    return 0;
}
