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

        vector<int> b(n + 1, 0); // to mark used positions
        bool flag = true;

        for (int i = 0; i < n; i++) 
        {
            int a;
            cin >> a;

            // keep dividing until we find a valid position
            while (a > 0) 
            {
                if (a <= n && b[a] == 0) 
                    break;

                a /= 2;
            }

            if (a <= 0) 
            {
                flag = false;
                continue;
            }

            if (a <= n) 
            {
                if (b[a] > 0) 
                    flag = false;
                b[a] = 1;
            }
        }

        cout << (flag ? "YES" : "NO") << "\n";
    }

    return 0;
}
