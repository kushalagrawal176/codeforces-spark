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

        int maxi = 0;
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                int sum = 0;

                // top-left diagonal
                int ti = i, tj = j;
                while (ti >= 0 && tj >= 0) 
                    sum += a[ti--][tj--];

                // bottom-right diagonal
                ti = i + 1; tj = j + 1;
                while (ti < n && tj < m) 
                    sum += a[ti++][tj++];

                // top-right diagonal
                ti = i - 1; tj = j + 1;
                while (ti >= 0 && tj < m) 
                    sum += a[ti--][tj++];

                // bottom-left diagonal
                ti = i + 1; tj = j - 1;
                while (ti < n && tj >= 0) 
                    sum += a[ti++][tj--];

                maxi = max(maxi, sum);
            }
        }

        cout << maxi << "\n";
    }

    return 0;
}
