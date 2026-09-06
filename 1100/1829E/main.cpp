#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        int n, m;
        cin>>n>>m;

        vector<vector<int>> a(n, vector<int>(m));
        for(int i=0; i<n; i++) 
        {
            for(int j=0; j<m; j++)
                cin>>a[i][j];
        }

        int cnt = 0;
        int dr[] = {-1, 1, 0, 0};
        int dc[] = {0, 0, -1, 1};

        for(int i=0; i<n; i++) 
        {
            for(int j=0; j<m; j++) 
            {
                if(a[i][j] == 0)
                    continue;

                int c = 0;
                queue<pair<int, int>> q;
                q.push({i, j});

                while(!q.empty()) 
                {
                    int c_i = q.front().first;
                    int c_j = q.front().second;

                    q.pop();

                    if(a[c_i][c_j] == 0)
                        continue;

                    c += a[c_i][c_j];
                    a[c_i][c_j] = 0; // Mark as visited

                    for(int d=0; d<4; d++) 
                    {
                        int ni = c_i + dr[d];
                        int nj = c_j + dc[d];

                        if(ni >= 0 && ni < n && nj >= 0 && nj < m && a[ni][nj] != 0)
                            q.push({ni, nj});
                    }
                }

                cnt = max(cnt, c);
            }
        }

        cout<<cnt<<"\n";
    }

    return 0;
}