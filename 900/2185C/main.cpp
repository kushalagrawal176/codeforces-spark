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

        int len = 1;
        int cnt = 1;

        for (int i = 1; i < n; i++) 
        {
            if (a[i - 1] == a[i]) {
                // skip duplicates
            } 
            else 
            {
                if (a[i - 1] + 1 == a[i])
                    cnt++;
                else 
                {
                    len = max(len, cnt);
                    cnt = 1;
                }
            }
        }

        len = max(len, cnt);

        cout << len << "\n";
    }

    return 0;
}
