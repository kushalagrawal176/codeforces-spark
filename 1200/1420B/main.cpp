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

        vector<long long> bit(32, 0); // count of numbers per MSB
        long long cnt = 0;

        for (int i = 0; i < n; i++) 
        {
            int a;
            cin >> a;
            
            for (int b = 31; b >= 0; b--) 
            {
                if (((a >> b) & 1) == 0) 
                    continue;

                cnt += bit[b];   // add pairs with same MSB
                bit[b]++;        // increment count for this MSB
                break;           // stop after first set bit from left
            }
        }
        cout << cnt << "\n";
    }

    return 0;
}
