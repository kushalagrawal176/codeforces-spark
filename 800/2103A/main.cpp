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
        
        for(int i=0;i<n;i++)
        {
            int num;
            cin>>num;
            
            mp[num]++;
        }
        
        cout<<mp.size()<<endl;
    }
    
    return 0;
}