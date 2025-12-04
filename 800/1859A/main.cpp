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

        vector<int> a(n), b, c;
        int mini = INT_MAX;

        for (int i = 0; i < n; i++) 
        {
            cin >> a[i];
            mini = min(mini, a[i]);
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) 
        {
            if (a[i] == mini) cnt++;
        }

        if (cnt == n) 
        {
            cout << -1 << "\n";
        } 
        else 
        {
            for (int i = 0; i < n; i++) 
            {
                if (a[i] == mini)
                    b.push_back(mini);
                else
                    c.push_back(a[i]);
            }

            cout << b.size() << " " << c.size() << "\n";
            for (int x : b) 
                cout << x << " ";
            cout << "\n";
            for (int x : c) 
                cout << x << " ";
            cout << "\n";
        }
    }

    return 0;
}
