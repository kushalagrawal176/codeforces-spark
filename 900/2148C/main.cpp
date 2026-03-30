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

        int prev_a = 0, prev_b = 0;
        long long cnt = 0;

        // diff even - 
        //   - bits changes -> (diff-1)
        //   - bits same -> (diff)
        // diff odd - 
        //   - bits change -> diff
        //   - bits same -> diff-1

        while (n--) 
        {
            int a, b;
            cin >> a >> b;

            int diff = a - prev_a;

            if (diff % 2 == 0) 
            {
                if (b == prev_b)
                    cnt += diff;
                else
                    cnt += diff - 1;
            } 
            else 
            {
                if (b == prev_b)
                    cnt += diff - 1;
                else
                    cnt += diff;
            }

            prev_a = a;
            prev_b = b;
        }

        cnt += m - prev_a;
        cout << cnt << "\n";
    }

    return 0;
}
