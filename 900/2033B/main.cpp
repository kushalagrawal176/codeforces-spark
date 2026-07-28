#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while(t--) 
    {
        int n;
        cin >> n;

        vector<vector<int>> a(n, vector<int>(n));
        for(int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++)
                cin >> a[i][j];
        }

        int cnt = 0;
        for(int i = 0; i < n; i++) 
        {
            for(int j = 0; j < n; j++) 
            {
                if(a[i][j] >= 0)
                    continue;

                int mini = INT_MAX;
                int t_i = i;
                int t_j = j;

                // Traverse along the main diagonal (bottom-right direction)
                while(t_i < n && t_j < n) 
                {
                    if (a[t_i][t_j] < 0)
                        mini = min(mini, a[t_i][t_j]);

                    a[t_i][t_j] = 0;
                    t_i++;
                    t_j++;
                }

                cnt += -1 * mini;
            }
        }

        cout << cnt << "\n";
    }

    return 0;
}