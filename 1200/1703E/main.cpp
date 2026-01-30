#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;
    while (t--) 
    {
        int n;
        cin >> n;

        vector<string> s(n);
        for (int i = 0; i < n; i++)
            cin >> s[i];

        int cnt = 0;
        for (int i = 0; i < (n + 1) / 2; i++) 
        {
            for (int j = 0; j < n / 2; j++) 
            {
                int one = 0;

                one += s[i][j] - '0';
                one += s[j][n - 1 - i] - '0';
                one += s[n - 1 - j][i] - '0';
                one += s[n - 1 - i][n - 1 - j] - '0';

                cnt += min(one, 4 - one);
            }
        }

        cout << cnt << "\n";
    }

    return 0;
}
