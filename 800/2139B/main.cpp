#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, m;
        cin >> n >> m;

        vector<long long> a(n);
        for (int i = 0; i < n; i++)
            cin >> a[i];

        // Sort in descending order
        sort(a.begin(), a.end(), greater<long long>());

        long long sum = 0;
        for (int i = 0; i < min(n, m); i++)
            sum += a[i] * (m - i);

        cout << sum << "\n";
    }

    return 0;
}
