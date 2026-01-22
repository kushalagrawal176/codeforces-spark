#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n, a, b, c;
    cin >> n >> a >> b >> c;

    int ans = 0;

    for (int i = 0; i <= n; i++) 
    {
        for (int j = 0; j <= n; j++) 
        {
            int k = n - (a * i + b * j);
            if (k >= 0 && k % c == 0)
                ans = max(ans, i + j + k / c);
        }
    }

    cout << ans << "\n";
    return 0;
}
