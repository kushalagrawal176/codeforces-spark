#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, q;
        cin >> n >> q;

        vector<long long> prefix_sum(n + 1, 0);
        vector<long long> max_ele(n + 1, 0);

        for (int i = 1; i <= n; i++) 
        {
            long long ele;
            cin >> ele;

            prefix_sum[i] = ele + prefix_sum[i - 1];
            max_ele[i] = max(ele, max_ele[i - 1]);
        }

        while (q--) 
        {
            long long ele;
            cin >> ele;

            int l = 0, r = n;
            while (l < r) 
            {
                int mid = (l + r + 1) / 2;
                if (max_ele[mid] <= ele)
                    l = mid;
                else
                    r = mid - 1;
            }

            cout << prefix_sum[l] << " ";
        }
        cout << "\n";
    }

    return 0;
}