#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int n;
    cin>>n;
    
    unordered_map<string,int> mp;
    
    while(n--)
    {
        string s;
        cin>>s;
        
        mp[s] = mp[s]+1;
        
        if(mp[s] > 1)
            cout<<s<<mp[s]-1<<endl;
        else
            cout<<"OK"<<endl;
    }
    
    
    return 0;
}