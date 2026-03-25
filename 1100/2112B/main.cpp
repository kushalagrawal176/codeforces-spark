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

        bool strictlyDecreasing = true;
        bool strictlyIncreasing = true;
        bool ans = false;

        for (int i = 1; i < n; i++) 
        {
            if (abs(a[i] - a[i - 1]) <= 1) 
            {
                ans = true;
                break;
            }

            if (strictlyDecreasing && a[i - 1] < a[i])
                strictlyDecreasing = false;
            if (strictlyIncreasing && a[i - 1] > a[i])
                strictlyIncreasing = false;
        }

        if (ans)
            cout << 0 << "\n";
        else if (strictlyDecreasing || strictlyIncreasing)
            cout << -1 << "\n";
        else
            cout << 1 << "\n";
    }

    return 0;
}
