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
        string s;
        cin >> s;

        long long cost = 0;
        vector<long long> c(n + 1, 0);

        for (int k = 1; k <= n; k++) 
        {
            for (int j = k; j <= n; j += k) 
            {
                if (s[j - 1] == '1') break;

                if (c[j] == 0) 
                {
                    cost += k;
                    c[j] = k;
                }
            }
        }

        cout << cost << "\n";
    }

    return 0;
}
