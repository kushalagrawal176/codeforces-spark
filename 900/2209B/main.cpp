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
        
        vector<long long> a(n);
        for(int i=0;i<n;i++)
            cin>>a[i];
        
        for(int i=0;i<n;i++)
        {
            int maxi = 0;
            int mini = 0;
            for(int j=i+1;j<n;j++)
            {
                if(a[j] > a[i])
                    maxi++;
                if(a[j] < a[i])
                    mini++;
            }
            
            cout<<max(mini, maxi)<<" ";
        }
        
        cout<<endl;
    }
    
    return 0;
}