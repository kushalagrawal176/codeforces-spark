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

        int max1 = -1, max2 = -1;

        for (int i = 0; i < n; i++) 
        {
            cin >> a[i];

            if (a[i] >= max1) 
            {
                max2 = max1;
                max1 = a[i];
            } 
            else if (a[i] > max2)
                max2 = a[i];
        }

        for (int i = 0; i < n; i++) 
        {
            if (a[i] == max1 && a[i] == max2)
                cout << 0 << " ";
            else if (a[i] == max1 && a[i] != max2)
                cout << a[i] - max2 << " ";
            else
                cout << a[i] - max1 << " ";
        }

        cout << "\n";
    }

    return 0;
}
