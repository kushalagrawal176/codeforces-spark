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

        for (int i = 0; i < n; i++)
            cin >> a[i];

        int len = -1;
        int ele1 = -1, ele2 = -1;

        for (int i = 0; i < n - 1; i++) 
        {
            if (a[i] <= a[i + 1]) 
                continue;

            len = 2;
            ele1 = a[i];
            ele2 = a[i + 1];

            break;
        }

        if (len == -1) {
            cout << "NO\n";
        } else {
            cout << "YES\n";
            cout << len << "\n" << ele1 << " " << ele2 << "\n";
        }
    }

    return 0;
}