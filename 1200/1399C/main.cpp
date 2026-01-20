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

        vector<int> arr(101, 0);
        for (int i = 0; i < n; i++) 
        {
            int x;
            cin >> x;
            arr[x]++;
        }

        int maxTeams = 0;
        // Try all possible sums from 0 to 100
        for (int s = 0; s <= 100; s++) 
        {
            int cur = 0;
            for (int j = 0; j <= s; j++) 
            {
                int k = s - j;
                if (k < 0 || k > 100) 
                    continue;

                cur += min(arr[j], arr[k]);
            }
            
            maxTeams = max(maxTeams, cur);
        }

        cout << maxTeams / 2 << "\n";
    }

    return 0;
}
