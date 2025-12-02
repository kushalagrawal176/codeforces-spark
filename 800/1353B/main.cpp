#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, k;
        cin >> n >> k;

        vector<int> a(n), b(n);
        for (int i = 0; i < n; i++) cin >> a[i];
        for (int i = 0; i < n; i++) cin >> b[i];

        sort(a.begin(), a.end());          // sort a ascending
        sort(b.begin(), b.end());          // sort b ascending

        for (int i = 0; i < n; i++) 
        {
            if (a[i] < b[n - i - 1] && k > 0) 
            {
                a[i] = b[n - i - 1];       // swap improvement
                k--;
            } 
            else 
            {
                break;
            }
        }

        long long sum = 0;
        for (int i = 0; i < n; i++) sum += a[i];

        cout << sum << "\n";
    }
    return 0;
}
