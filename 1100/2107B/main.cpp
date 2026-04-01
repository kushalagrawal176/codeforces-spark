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

        vector<int> a(n);
        long long sum = 0;

        for (int i = 0; i < n; i++) 
        {
            cin >> a[i];
            sum += a[i];
        }

        sort(a.begin(), a.end());
        a[n - 1]--;  // decrement the largest element
        sort(a.begin(), a.end());

        if (a[n - 1] - a[0] > k || sum % 2 == 0)
            cout << "Jerry\n";
        else
            cout << "Tom\n";
    }

    return 0;
}
