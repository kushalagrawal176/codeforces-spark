#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int n;
    cin>>n;
    
    vector<vector<int>> AdjList(n+1);
    
    for(int i=1;i<=n;i++)
    {
        int a;
        cin>>a;
        
        if(a == -1)
            continue;
            
        AdjList[a].push_back(i);
    }
    
    queue<int> q;
    int cnt = 0;
    
    for(int i=1;i<=n;i++)
    {
        if(AdjList[i].size() == 0)
            continue;
        
        int c = 0;
        q.push(i);
        while(q.size() > 0)
        {
            int s = q.size();
            c++;
            
            for(int i=0;i<s;i++)
            {
                int node = q.front();
                q.pop();
                
                for(int j=0;j<AdjList[node].size();j++)
                    q.push(AdjList[node][j]);
            }
        }
        
        cnt = max(cnt, c);
    }
    
    if(cnt == 0)
        cnt = 1;
        
    cout<<cnt<<endl;
    
    return 0;
}