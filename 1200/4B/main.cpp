#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int d, sum;
    cin >> d >> sum;

    vector<int> ans(d);
    int maxi = 0, mini = 0;
    vector<pair<int,int>> a(d);

    for (int i = 0; i < d; i++) 
    {
        cin >> a[i].first >> a[i].second;
        ans[i] = a[i].first;

        maxi += a[i].second;
        mini += a[i].first;
    }

    if (maxi < sum || mini > sum)
        cout << "NO\n";
    else 
    {
        int rem = sum - mini;

        for (int i = 0; i < d; i++) 
        {
            int add = min(rem, a[i].second - a[i].first);
            ans[i] += add;
            rem -= add;
            if (rem == 0) break;
        }

        cout << "YES\n";
        for (int i = 0; i < d; i++) 
            cout << ans[i] << " ";
        
        cout << "\n";
    }

    return 0;
}
