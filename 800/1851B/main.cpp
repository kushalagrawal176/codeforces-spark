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

        vector<int> a(n), b(n);
        for (int i = 0; i < n; i++) 
        {
            cin >> a[i];
            b[i] = a[i];
        }

        sort(a.begin(), a.end());

        bool flag = true;
        for (int i = 0; i < n; i++) 
        {
            if (a[i] % 2 != b[i] % 2) 
            {
                flag = false;
                break;
            }
        }

        if (flag)
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
