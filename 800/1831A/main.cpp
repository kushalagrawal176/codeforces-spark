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

        vector<int> ans;
        for (int i = 1; i <= n; i++) 
        {
            int a;
            cin >> a;
            ans.push_back(n + 1 - a);
        }

        for (int i = 0; i < n; i++) 
        {
            cout << ans[i] << " ";
        }
        cout << "\n";
    }

    return 0;
}
