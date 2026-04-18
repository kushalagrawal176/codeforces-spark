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
        
        long long c,k;
        cin>>c>>k;
        
        vector<long long> a(n);
        for(int i=0;i<n;i++)
            cin>>a[i];
        
        sort(a.begin(), a.end());
 
        for(int i=0;i<n;i++)
        {
            if(a[i] <= c)
            {
                if(k > 0)
                {
                    long long mini = c-a[i];
                    c += a[i] + min(k, mini);
                    k -= min(k, mini);
                }
                else
                    c += a[i];
            }
        }
        
        cout<<c<<endl;
    }
    
    return 0;
}