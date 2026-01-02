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
        int one = 0;
        
        for(int i=0;i<n;i++)
        {
            cin>>a[i];
            if(a[i] == 1)
                one++;
        }
        
        bool flag = true;
        for(int i=0;i<n-1;i++)
        {
            if(a[i] == a[i+1] && a[i] == 0)
                flag = false;
            
            if(flag)
                continue;
            else
                break;
        }
        
        if(one == n)
            flag = false;
        
        if(flag)
            cout<<"NO"<<endl;
        else
            cout<<"YES"<<endl;
    }
    
    return 0;
}