#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;  // number of test cases

    while (t--) 
    {
        int n, m;
        cin >> n >> m;  // number of players and numbers per card

        vector<vector<int>> cards(n, vector<int>(m));
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                cin >> cards[i][j];
            }
        }

        long long totalWinnings = 0;

        // Process each column independently
        for (int j = 0; j < m; j++) 
        {
            vector<int> column(n);
            for (int i = 0; i < n; i++) 
            {
                column[i] = cards[i][j];
            }

            sort(column.begin(), column.end());

            // Contribution formula
            for (int k = 0; k < n; k++)
                totalWinnings += 1LL * column[k] * (2LL * k - n + 1);
        }

        cout << totalWinnings << "\n";
    }

    return 0;
}
