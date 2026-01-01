#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, c;
        cin >> n >> c;

        vector<int> a(n);
        for (int i = 0; i < n; i++) 
            cin >> a[i];
        
        sort(a.begin(), a.end());

        int coins = 0;
        long long m = 1;

        for (int i = n - 1; i >= 0; i--) 
        {
            if (1LL * a[i] * m <= c) 
                m *= 2;
            else 
                coins++;
        }

        cout << coins << "\n";
    }

    return 0;
}
