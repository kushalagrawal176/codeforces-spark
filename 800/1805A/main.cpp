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

        int val = 0;
        for (int i = 0; i < n; i++) 
        {
            cin >> a[i];
            val ^= a[i];  // XOR all elements
        }

        int ans = 0;
        for (int i = 0; i < n; i++) 
            ans ^= (a[i] ^ val);

        if (ans == 0)
            cout << val << "\n";
        else
            cout << -1 << "\n";
    }

    return 0;
}
