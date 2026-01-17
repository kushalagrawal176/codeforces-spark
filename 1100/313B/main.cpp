#include <bits/stdc++.h>
using namespace std;

int main() 
{
    string s;
    cin >> s;

    int n = s.size();
    vector<int> a(n, 0);

    // Precompute prefix sums
    for (int i = 1; i < n; i++) 
    {
        if (s[i] == s[i - 1])
            a[i] = a[i - 1] + 1;
        else
            a[i] = a[i - 1];
    }

    int t;
    cin >> t;
    while (t--) 
    {
        int l, r;
        cin >> l >> r;
        cout << a[r - 1] - a[l - 1] << "\n";
    }

    return 0;
}
