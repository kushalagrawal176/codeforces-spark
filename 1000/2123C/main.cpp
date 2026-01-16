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
        vector<int> mini(n, INT_MAX);
        vector<int> maxi(n, -1);
        for(int i=0;i<n;i++)
            cin>>a[i];
        
        int m = a[0];
        for(int i=1;i<n;i++)
        {
            mini[i] = m;
            m = min(m, a[i]);
        }
        
        m = a[n-1];
        for(int i=n-2;i>=0;i--)
        {
            maxi[i] = m;
            m = max(m, a[i]);
        }
        
        mini[0] = -1;
        maxi[n-1] = -1;
        
        string ans = "";
        for(int i=0;i<n;i++)
        {
            if(mini[i] == -1 || maxi[i] == -1)
                ans += "1";
            else if(mini[i] <= a[i] && maxi[i] >= a[i])
                ans += "0";
            else
                ans += "1";
        }
        
        cout<<ans<<endl;
    }
    
    return 0;
}