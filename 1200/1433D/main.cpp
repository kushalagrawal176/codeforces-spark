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

        // Store types of each district (1-based indexing)
        vector<long long> districtType(n + 1);

        for (int i = 1; i <= n; i++)
            cin >> districtType[i];

        // Find the first index where district type differs from previous one
        int firstDifferentIndex = -1;
        for (int i = 2; i <= n; i++) 
        {
            if (districtType[i] != districtType[i - 1]) 
            {
                firstDifferentIndex = i;
                break;
            }
        }

        // If all districts have the same type, connection is impossible
        if (firstDifferentIndex == -1) 
        {
            cout << "NO\n";
            continue;
        }

        cout << "YES\n";

        /*
         * Step 1:
         * Connect district 1 with all districts that have a different type
         */
        for (int i = 2; i <= n; i++) 
        {
            if (districtType[1] != districtType[i])
                cout << 1 << " " << i << "\n";
        }

        /*
         * Step 2:
         * Connect remaining districts (same type as district 1)
         * using the first district that had a different type
         */
        for (int i = 2; i <= n; i++) 
        {
            if (districtType[1] == districtType[i]) 
                cout << firstDifferentIndex << " " << i << "\n";
        }
    }

    return 0;
}
