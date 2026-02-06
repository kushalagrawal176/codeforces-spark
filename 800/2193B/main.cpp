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
        for(int i=0;i<n;i++)
            cin>>a[i];
        
        int ptr = n;
        int i = 0;
        while(i < n && ptr == a[i])
        {
            cout<<a[i]<<" ";
            i++;
            ptr--;
        }
        
        int l = i;
        for(;i<n;i++)
        {
            if(a[i] == ptr)
                break;
        }
        
        if(i == n)
        {
            cout<<endl;
            continue;
        }
            
        for(int j=i;j>=l;j--)
            cout<<a[j]<<" ";

        i++;
        
        for(;i<n;i++)
            cout<<a[i]<<" ";
        
        cout<<endl;
    }
    
    return 0;
}