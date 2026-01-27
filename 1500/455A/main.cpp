#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin >> n;

    vector<long long> a(100001, 0);

    for (int i = 0; i < n; i++) 
    {
        int x;
        cin >> x;
        a[x] += x;
    }

    for (int i = 2; i < 100001; i++)
        a[i] = max(a[i] + a[i - 2], a[i - 1]);

    cout << a[100000] << "\n";

    return 0;
}
