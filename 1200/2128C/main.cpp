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
        string ans = "YES";

        long long minVal = 1e9;  // initialize with a large value
        for (int i = 0; i < n; i++) 
        {
            int ele;
            cin >> ele;

            if (minVal * 2 <= ele)
                ans = "NO";

            minVal = min(minVal, (long long)ele);
        }

        cout << ans << "\n";
    }

    return 0;
}
