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
        {
            cin >> a[i];
        }

        int mini = INT_MAX;
        for (int i = 0; i < n - 1; i++) 
        {
            mini = min(mini, a[i + 1] - a[i]);
        }

        if (mini < 0) 
        {
            cout << 0 << "\n";
        } 
        else 
        {
            if (mini == 0)
                cout << 1 << "\n";
            else
                cout << mini / 2 + 1 << "\n";
        }
    }

    return 0;
}
