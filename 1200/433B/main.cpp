#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin >> n;

    vector<long long> a(n), b(n);

    cin >> a[0];
    b[0] = a[0];

    // prefix sum for original array
    for (int i = 1; i < n; i++)
    {
        cin >> a[i];
        b[i] = a[i];
        a[i] += a[i - 1];
    }

    // sort and prefix sum for sorted array
    sort(b.begin(), b.end());
    for (int i = 1; i < n; i++)
        b[i] += b[i - 1];

    int m;
    cin >> m;
    while (m--) 
    {
        int type, l, r;
        cin >> type >> l >> r;

        if (type == 1) 
        {
            // query on original array
            if (l - 2 >= 0)
                cout << a[r - 1] - a[l - 2] << "\n";
            else
                cout << a[r - 1] << "\n";
        } 
        else 
        {
            // query on sorted array
            if (l - 2 >= 0)
                cout << b[r - 1] - b[l - 2] << "\n";
            else
                cout << b[r - 1] << "\n";
        }
    }

    return 0;
}
