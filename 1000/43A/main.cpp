#include<bits/stdc++.h> 
using namespace std;
 
int main()
{
    int n;
    cin>>n;
    
    unordered_map<string, int> mp;
    int max = 0;
    string ans = "";
    
    while(n--)
    {
        string a;
        cin>>a;
        
        if(mp[a])
        {
            mp[a] = mp[a] + 1;
            if(max < mp[a])
            {
                max = mp[a];
                ans = a;
            }
        }
        else
        {
            mp[a] = 1;
            if(ans == "")
                ans = a;
        }
    }
    
    cout<<ans;
    
    return 0;
}
