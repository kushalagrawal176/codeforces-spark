#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        long long x;
        cin >> n >> x;

        long long temp = 0;
        long long maxVal = LLONG_MIN;

        for (int i = 0; i < n; i++) 
        {
            long long a, b, c;
            cin >> a >> b >> c;

            temp += (b - 1) * a;
            maxVal = max(maxVal, a * b - c);
        }

        if (temp >= x)
            cout << 0 << "\n";
        else if (maxVal <= 0)
            cout << -1 << "\n";
        else
            cout << (x - temp + maxVal - 1) / maxVal << "\n";
    }

    return 0;
}
