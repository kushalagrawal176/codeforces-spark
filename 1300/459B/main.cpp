#include <bits/stdc++.h>
using namespace std;

int main() 
{
    long long n;
    cin >> n;

    vector<long long> a(n);
    long long maxVal = -1, minVal = 1000000000;

    for (int i = 0; i < n; i++) 
    {
        cin >> a[i];
        minVal = min(minVal, a[i]);
        maxVal = max(maxVal, a[i]);
    }

    long long x = 0, y = 0;
    for (int i = 0; i < n; i++) 
    {
        if (a[i] == maxVal) 
            x++;
        if (a[i] == minVal) 
            y++;
    }

    if (maxVal == minVal)
        cout << 0 << " " << (n * (n - 1)) / 2 << "\n";
    else
        cout << (maxVal - minVal) << " " << (x * y) << "\n";

    return 0;
}
