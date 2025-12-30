#include <bits/stdc++.h>
using namespace std;

long long damage(vector<int>& a, int n, long long k) 
{
    long long cnt = 0;
    for (int i = 0; i < n - 1; i++) 
    {
        if (a[i] + k < a[i + 1])
            cnt += k;
        else
            cnt += (a[i + 1] - a[i]);
    }

    cnt += k;
    return cnt;
}

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        long long h;
        cin >> n >> h;

        vector<int> a(n);
        for (int i = 0; i < n; i++)
            cin >> a[i];

        if (h <= n)
            cout << 1 << "\n";
        else 
        {
            long long k = 1;
            long long low = 1, high = h;

            while (low <= high) 
            {
                long long mid = low + (high - low) / 2;

                if (damage(a, n, mid) >= h) 
                {
                    k = mid;
                    high = mid - 1;
                } 
                else
                    low = mid + 1;
            }

            cout << k << "\n";
        }
    }

    return 0;
}
