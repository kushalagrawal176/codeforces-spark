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
        
        unordered_map<int,int> mp;
        unordered_map<int,int> mp1;
        
        vector<int> a(n);
        for(int i=0;i<n;i++)
        {
            cin>>a[i];
            mp[a[i]]++;
        }
        
        sort(a.begin(), a.end());
        
        int l;
        int r;
        if(a[0] != 0)
            l = 0;
        else
            l = 1;
        
        bool flag = true;
        for(int i=0;i<n-1;i++)
        {
            mp[a[i]]--;
            mp1[a[i]]++;
            
            l = 0;
            while(mp1[l] > 0)
                l++;
            
            r = 0;
            while(mp[r] > 0)
                r++;
            
            if(l == r)
            {
                flag = false;
                break;
            }
        }
        
        if(flag)    
            cout<<"YES"<<endl;
        else
            cout<<"NO"<<endl;
    }
    
    return 0;
}