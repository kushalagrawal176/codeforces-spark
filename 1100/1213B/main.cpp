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

        int mini = a[n - 1];
        int cnt = 0;

        for (int i = n - 1; i >= 0; i--) 
        {
            if (mini < a[i])
                cnt++;
            else
                mini = a[i];
        }

        cout << cnt << "\n";
    }

    return 0;
}
