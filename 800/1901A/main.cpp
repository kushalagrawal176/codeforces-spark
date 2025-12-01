#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;  // number of test cases

    while (t--) 
    {
        int n, x;
        cin >> n >> x;  // n = number of stations, x = final destination

        int prev;
        cin >> prev;  // first station position

        int ans = INT_MIN;
        ans = max(ans, prev - 0);  // distance from start (0) to first station

        // process remaining stations
        for (int i = 0; i < n - 1; i++) 
        {
            int next;
            cin >> next;
            
            ans = max(ans, next - prev);  // max gap between consecutive stations
            prev = next;
        }

        // consider the final stretch: double the distance from last station to destination
        ans = max(ans, 2 * (x - prev));

        cout << ans << "\n";
    }

    return 0;
}
