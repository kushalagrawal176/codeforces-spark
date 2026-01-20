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

        long long a;
        cin >> a;
        long long ans = 0;

        for (int i = 1; i < n; i++) 
        {
            long long temp;
            cin >> temp;

            if (temp * a > 0) 
            {
                // Same sign, keep the maximum
                a = max(a, temp);
            } 
            else 
            {
                // Different sign, add the previous segment maximum
                ans += a;
                a = temp;
            }
        }
        ans += a; // add the last segment maximum

        cout << ans << "\n";
    }

    return 0;
}
