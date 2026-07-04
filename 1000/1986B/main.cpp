#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, m;
        cin >> n >> m;

        vector<vector<int>> a(n, vector<int>(m));
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++)
                cin >> a[i][j];
        }

        // Process each cell
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                int maxi = -1;

                if (i - 1 >= 0) 
                {
                    if (a[i][j] > a[i - 1][j])
                        maxi = max(maxi, a[i - 1][j]);
                    else
                        continue;
                }

                if (i + 1 < n) 
                {
                    if (a[i][j] > a[i + 1][j])
                        maxi = max(maxi, a[i + 1][j]);
                    else
                        continue;
                }

                if (j - 1 >= 0) 
                {
                    if (a[i][j] > a[i][j - 1])
                        maxi = max(maxi, a[i][j - 1]);
                    else
                        continue;
                }

                if (j + 1 < m) 
                {
                    if (a[i][j] > a[i][j + 1])
                        maxi = max(maxi, a[i][j + 1]);
                    else
                        continue;
                }

                if (maxi != -1)
                    a[i][j] = maxi;
            }
        }

        // Output the stabilized matrix
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++)
                cout << a[i][j] << " ";

            cout << "\n";
        }
    }

    return 0;
}
