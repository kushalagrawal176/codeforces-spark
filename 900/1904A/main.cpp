#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int a, b, c, d, e, f;
        cin >> a >> b >> c >> d >> e >> f;

        int ans = 0;

        // All possible moves of the "generalized knight"
        int pos[8][2] = 
        {
            {a, b}, {a, -b}, {-a, b}, {-a, -b},
            {b, a}, {b, -a}, {-b, a}, {-b, -a}
        };

        for (int i = 0; i < 8; i++) 
        {
            for (int j = 0; j < 8; j++) 
            {
                if (c + pos[i][0] + pos[j][0] == e &&
                    d + pos[i][1] + pos[j][1] == f) 
                {
                    ans++;
                }
            }
        }

        if (a == b) 
            ans /= 4; // symmetry adjustment

        cout << ans << "\n";
    }

    return 0;
}
