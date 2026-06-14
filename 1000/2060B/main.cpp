#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, m;
        cin >> n >> m;

        vector<int> arr(n, 0);
        int p = 0;

        for (int j = 0; j < n; j++) 
        {
            int l;
            cin >> l;
            l %= n;

            for (int i = 1; i < m; i++) 
            {
                int a;
                cin >> a;

                if (l != a % n)
                    p = -1;
            }

            if (p != -1)
                arr[l] = j + 1;
        }

        if (p == -1)
            cout << p << "\n";
        else 
        {
            for (int i = 0; i < n; i++)
                cout << arr[i] << " ";

            cout << "\n";
        }
    }

    return 0;
}
