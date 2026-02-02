#include <bits/stdc++.h>
using namespace std;

int gcd(int a, int b) 
{
    if (b == 0) 
        return a;

    return gcd(b, a % b);
}

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

        int val = 0;
        for (int i = 0; i < n / 2; i++) 
            val = gcd(val, abs(a[i] - a[n - 1 - i]));

        cout << val << "\n";
    }

    return 0;
}
