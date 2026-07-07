#include<bits/stdc++.h>
using namespace std;

void solve() 
{
    int n;
    cin >> n;
    vector<int> a(n);
    
    cin >> a[0];
    for (int i = 1; i < n; i++) 
    {
        int val;
        cin >> val;

        a[i] = val + a[i - 1];
    }
    
    int m;
    cin >> m;
    vector<int> b(m);
    
    cin >> b[0];
    for (int i = 1; i < m; i++) 
    {
        int val;
        cin >> val;

        b[i] = val + b[i - 1];
    }
    
    int maxi = 0;
    
    // Find max prefix sum combination
    for (int i = 0; i < n; i++) 
    {
        maxi = max(maxi, a[i]);

        for (int j = 0; j < m; j++)
            maxi = max({maxi, a[i] + b[j], b[j]});
    }
    
    cout << maxi << "\n";
}

int main() 
{    
    int t;
    cin >> t;

    while (t--)
        solve();
    
    return 0;
}