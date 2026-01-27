#include<bits/stdc++.h>
using namespace std;
 
vector<vector<int>> adj;
vector<int> cats;
int n, m, ans = 0;
 
void dfs(int node, int parent, int consecutive) 
{
    if (cats[node])
        consecutive++;
    else
        consecutive = 0;

    if (consecutive > m)
        return;

    bool isLeaf = true;
    for (int neigh : adj[node]) 
    {
        if (neigh != parent) 
        {
            isLeaf = false;
            dfs(neigh, node, consecutive);
        }
    }

    if (isLeaf)
        ans++;
}
 
int main() 
{
    cin >> n >> m;
    cats.resize(n);
    adj.resize(n);

    for (int i = 0; i < n; ++i)
        cin >> cats[i];

    for (int i = 0; i < n - 1; ++i) 
    {
        int u, v;
        cin >> u >> v;
        
        --u; 
        --v;
        adj[u].push_back(v);
        adj[v].push_back(u);
    }

    dfs(0, -1, 0);

    cout << ans << endl;
    
    return 0;
}