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

        long long z = 0;
        for (int i = 0; i < n - 1; i++)
            z += abs(a[i] - a[i + 1]);

        long long y = z - abs(a[0] - a[1]);
        y = min(y, z - abs(a[n - 2] - a[n - 1]));

        for (int i = 1; i < n - 1; i++)
            y = min(y, z - abs(a[i - 1] - a[i]) - abs(a[i] - a[i + 1]) + abs(a[i - 1] - a[i + 1]));

        cout << y << "\n";
    }

    return 0;
}
