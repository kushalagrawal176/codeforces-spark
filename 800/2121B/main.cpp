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
        
        string s;
        cin>>s;
        
        unordered_map<char,int> mp;
        mp[s[0]]++;
        mp[s[n-1]]++;
        
        bool flag = false;
        for(int i=1;i<n-1;i++)
        {
            if(mp[s[i]] > 0)
            {
                flag = true;
                break;
            }
            mp[s[i]]++;
        }
        
        if(flag)
            cout<<"YES"<<endl;
        else
            cout<<"NO"<<endl;
    }
    
    return 0;
}