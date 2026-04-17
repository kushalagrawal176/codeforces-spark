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

        bool flag = true;

        int d = a[1] - a[0];
        for (int i = 1; i < n; i++)
        {
            if (a[i] - a[i - 1] != d)
            {
                flag = false;
                break;
            }
        }

        if (flag)
            flag = (a[0] - d >= 0) && (a[0] + n * d >= 0) && ((a[0] - d) % (n + 1) == 0);

        cout << (flag ? "YES" : "NO") << "\n";
    }

    return 0;
}
