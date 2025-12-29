#include <bits/stdc++.h>
using namespace std;
 
int main() 
{
    int t;
    cin>>t;
    
    while(t--)
    {
        int n;
        cin>>n;
        
        unordered_map<int, int> mp;
        int cnt = 0;
        
        int arr[n];
        for(int i=0;i<n;i++)
            cin>>arr[i];
        
        for(int i=0;i<n;i++)
        {
            if(mp[arr[i]])
                mp[arr[i]] = mp[arr[i]] + 1;
            else
                mp[arr[i]] = 1;
            
            if(mp[arr[i]] == 2)
            {
                cnt++;
                mp[arr[i]] = 0;
            }
        }
        
        cout<<cnt<<endl;
    }
 
    return 0;
}