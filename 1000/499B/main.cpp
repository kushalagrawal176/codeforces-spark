#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int n,m;
    cin>>n>>m;
    
    unordered_map<string, string> mp;
    
    for(int i=0;i<m;i++)
    {
        string a,b;
        cin>>a>>b;
        
        if(a.length() <= b.length())
            mp[b] = a;
        else
            mp[a] = b;
    }
    
    string s = "";
    
    for(int i=0;i<n;i++)
    {
        string a;
        cin>>a;
        
        if(mp[a].length() > 0)
            s = s + mp[a] + " ";
        else
            s = s + a + " ";
    }
    
    cout<<s;
    
    return 0;
}