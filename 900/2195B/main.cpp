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
        int f = 0;

        for (int i = 0; i < n; i++) 
        {
            cin >> a[i];
            int x = i + 1;

            while (x % 2 == 0) 
                x /= 2;

            while (a[i] % 2 == 0) 
                a[i] /= 2;

            if (x != a[i]) 
                f = 1;
        }

        if (f == 0) 
            cout << "YES\n";
        else 
            cout << "NO\n";
    }

    return 0;
}
