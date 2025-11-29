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

        vector<int> a(n + 1);
        for (int i = 1; i <= n; i++)
            cin >> a[i];

        long long count = 0;

        // iterate over i
        for (int i = 1; i <= n; i++) 
        {
            int ai = a[i];

            // multiples of ai: ai * k <= 2n
            for (int k = 1; ai * k <= 2 * n; k++) 
            {
                int j = ai * k - i;

                // j must be > i and within bounds
                if (j > i && j <= n) 
                {
                    if (a[j] == k) {
                        count++;
                    }
                }
            }
        }

        cout << count << "\n";
    }

    return 0;
}