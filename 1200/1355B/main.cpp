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

        long long cnt = 0, grps = 0;
        for (int i = 0; i < n; i++) 
        {
            cnt++;
            if (cnt >= a[i]) 
            {
                grps++;
                cnt = 0;
            }
        }

        cout << grps << "\n";
    }
    
    return 0;
}
