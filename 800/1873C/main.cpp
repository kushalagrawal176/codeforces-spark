#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;  // number of test cases

    while (t--) 
    {
        int cnt = 0;

        // The board is always 10x10
        for (int i = 1; i <= 10; i++) 
        {
            string s;
            cin >> s;  // read each row of the board

            for (int j = 1; j <= 10; j++) 
            {
                if (s[j - 1] == 'X') 
                {
                    // Distance from edges vertically and horizontally
                    int x = min(i, 10 - i + 1);
                    int y = min(j, 10 - j + 1);

                    // Score is the minimum of the two distances
                    cnt += min(x, y);
                }
            }
        }

        cout << cnt << "\n";
    }

    return 0;
}