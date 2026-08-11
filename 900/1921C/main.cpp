#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        long long f, a, b;
        cin >> n >> f >> a >> b;

        vector<long long> A(n + 1, 0);
        long long sum = 0;

        for (int i = 1; i <= n; i++) 
        {
            cin >> A[i];
            sum += min((A[i] - A[i - 1]) * a, b);
        }

        if (sum >= f)
            cout << "NO\n";
        else
            cout << "YES\n";
    }

    return 0;
}