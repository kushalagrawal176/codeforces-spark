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

        int maxi = INT_MIN;
        vector<vector<int>> a(n, vector<int>(m));

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                cin >> a[i][j];
                maxi = max(maxi, a[i][j]);
            }
        }

        vector<int> rows(n, 0);
        vector<int> columns(m, 0);
        int cnt = 0;

        // Count occurrences of maxi in each row
        for (int i = 0; i < n; i++) 
        {
            int c = 0;
            for (int j = 0; j < m; j++) 
            {
                if (a[i][j] == maxi) 
                    c++;
            }

            cnt += c;
            rows[i] = c;
        }

        // Count occurrences of maxi in each column
        for (int j = 0; j < m; j++) 
        {
            int c = 0;
            for (int i = 0; i < n; i++) 
            {
                if (a[i][j] == maxi) 
                    c++;
            }

            columns[j] = c;
        }

        bool flag = false;
        for (int i = 0; i < n && !flag; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                int c = rows[i] + columns[j];
                if (a[i][j] == maxi) 
                    c--; // avoid double counting

                if (c == cnt) 
                {
                    flag = true;
                    break;
                }
            }
        }

        if (flag) 
            cout << maxi - 1 << "\n";
        else 
            cout << maxi << "\n";
    }

    return 0;
}
