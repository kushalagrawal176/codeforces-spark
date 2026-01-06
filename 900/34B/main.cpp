#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n,m;
    cin>>n>>m;
    
    vector<int> ans;
    
    for(int i=0;i<n;i++)
    {
        int a;
        cin>>a;
        
        ans.push_back(a);
    }
    
    sort(ans.begin(), ans.end());
    
    int sum = 0;
    
    for(int i=0;i<m;i++)
    {
        if(ans[i]>=0)
            break;
        sum = sum + ans[i];
    }
    
    cout<<sum*-1;
    
    return 0;
}