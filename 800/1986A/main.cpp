#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t; // number of test cases

    while (t--) 
    {
        int a, b, c;
        cin >> a >> b >> c; // three integers

        int mini = min({a, b, c}); // minimum of the three
        int maxi = max({a, b, c}); // maximum of the three

        int ans = INT_MAX; // initialize with large value

        // Try all possible meeting points between min and max
        for (int i = mini; i <= maxi; i++) 
        {
            int dist = abs(i - a) + abs(i - b) + abs(i - c);
            ans = min(ans, dist);
        }

        cout << ans << "\n"; // print the minimum distance
    }

    return 0;
}
