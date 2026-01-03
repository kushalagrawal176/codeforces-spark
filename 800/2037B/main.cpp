#include <bits/stdc++.h>
using namespace std;
 
int main() 
{
    int t;
    cin>>t;
    
    while(t--)
    {
        int k;
        cin>>k;
        
        int arr[k];
        for(int i=0;i<k;i++)
            cin>>arr[i];
        
        map<int, int> mp;
        
        for(int i=0;i<k;i++)
        {
            if(mp[arr[i]])
                mp[arr[i]] = mp[arr[i]]+1;
            else
                mp[arr[i]] = 1;
        }
        
        for(int i=1;i<=k-2;i++)
        {
            if(i*((k-2)/i) == k-2)
            {
                if(mp[i]>0)
                {
                    mp[i] = mp[i]-1;
                    if(mp[(k-2)/i]>0)
                    {
                        cout<<i<<" "<<(k-2)/i<<endl;;
                        break;
                    }
                }
            }
        }
    }
 
    return 0;
}