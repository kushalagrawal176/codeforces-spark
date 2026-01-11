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
        
        string s = "";
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int a;
                cin>>a;
                
                mp[a]++;
                if(mp[a] == 1)
                    s = s + " " + to_string(a);
            }
        }
        
        for(int i=1;i<=2*n;i++)
        {
            if(mp[i] == 0)
            {
                s = to_string(i)+s;
                break;
            }
        }
        
        cout<<s<<endl;
    }
    
    return 0;
}