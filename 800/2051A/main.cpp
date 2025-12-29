#include <bits/stdc++.h>
 
using namespace std;
 
int main() 
{
    int t;
    cin>>t;
    
    while(t--)
    {
        int n;
        cin>>n;
        
        int a[n];
        int b[n];
        
        for(int i=0;i<n;i++)
            cin>>a[i];
        
        for(int i=0;i<n;i++)
            cin>>b[i];
            
        int cnt = 0;
        for(int i=0;i<n-1;i++)
        {
            if(a[i] >= b[i+1])
                cnt = cnt + a[i] - b[i+1];
        }
        
        cout<<cnt + a[n-1]<<endl;
    }
 
    return 0;
}