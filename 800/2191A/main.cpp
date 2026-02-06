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
        
        vector<int> a(n+1);
        for(int i=0;i<n;i++)
        {
            int ele;
            cin>>ele;
            
            a[ele] = i;
        }
        
        bool flag = true;
        for(int i=1;i<=n;i++)
        {
            if(i == 1)
            {
                if(abs(a[2]-a[1])%2 == 0)
                    flag = false;
            }
            else if(i == n)
            {
                if(abs(a[n]-a[n-1])%2 == 0)
                    flag = false;
            }
            else
            {
                if(abs(a[i]-a[i-1])%2 == 0)
                    flag = false;
                else if(abs(a[i]-a[i+1])%2 == 0)
                    flag = false;
                else
                {}
            }
        }
        
        if(flag)
            cout<<"YES"<<endl;
        else
            cout<<"NO"<<endl;
    }
    
    return 0;
}