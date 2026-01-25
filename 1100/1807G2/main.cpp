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

        sort(a.begin(), a.end());

        long long sum = 1;
        bool flag = (a[0] == 1);

        for (int i = 1; i < n; i++) 
        {
            if (a[i] <= sum)
                sum += a[i];
            else 
            {
                flag = false;
                break; // no need to continue once condition fails
            }
        }

        if (flag)
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
