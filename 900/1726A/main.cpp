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
        vector<int> a(n);

        for (int i = 0; i < n; i++) 
            cin >> a[i];

        int maxi = INT_MIN;

        for (int i = 0; i < n; i++) 
        {
            maxi = max(maxi, a[i] - a[0]);
            maxi = max(maxi, a[n - 1] - a[i]);
            maxi = max(maxi, a[i] - a[(i + 1) % n]);
        }

        cout << maxi << "\n";
    }

    return 0;
}
