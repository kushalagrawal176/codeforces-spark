#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        long long k;
        cin >> n >> k;

        vector<long long> arr(n);
        for (int i = 0; i < n; i++)
            cin >> arr[i];

        long long ans = 0;

        for (int i = 0; i < 63; i++) 
        {
            priority_queue<long long, vector<long long>, greater<long long>> pq;
            long long num = 1LL << i;

            for (int j = 0; j < n; j++) 
            {
                long long a = arr[j];
                if ((num & a) > 0)
                    ans++;
                else
                    pq.push(num);
            }

            while (!pq.empty() && k >= pq.top()) 
            {
                long long a = pq.top();
                pq.pop();

                ans++;
                k -= a;
            }
        }

        cout << ans << "\n";
    }

    return 0;
}
