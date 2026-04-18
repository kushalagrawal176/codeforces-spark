#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int t;
    cin>>t;
    
    while(t-- > 0)
    {
        int n;
        cin>>n;
        
        vector<int> a(n);
        for(int i=0;i<n;i++)
            cin>>a[i];
        
        int cnt = 0;
        for(int i=0;i<n;i++)
        {
            if(a[i] >= a[a[i]-1])
                cnt++;
        }
        
        cout<<cnt<<endl;
    }
    
    return 0;
}