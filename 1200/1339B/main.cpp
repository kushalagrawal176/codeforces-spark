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
        vector<long long> a(n);

        for (int i = 0; i < n; i++)
            cin >> a[i];

        sort(a.begin(), a.end());

        int l = (n - 1) / 2;
        int r = l + 1;

        while (l >= 0 || r < n) 
        {
            if (l >= 0) 
            {
                cout << a[l] << " ";
                l--;
            }
            if (r < n) 
            {
                cout << a[r] << " ";
                r++;
            }
        }
        
        cout << "\n";
    }

    return 0;
}
