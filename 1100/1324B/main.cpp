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
        vector<int> freq(5001, 0);

        for (int i = 0; i < n; i++) 
        {
            cin >> a[i];
            freq[a[i]]++;
        }

        bool flag = false;
        for (int i = 0; i < n - 1; i++) 
        {
            if (freq[a[i]] == 1)
                continue;

            if (freq[a[i]] > 2) 
            {
                flag = true;
                break;
            }

            if (a[i] == a[i + 1]) 
            {
                i++;
                continue;
            }

            flag = true;
            break;
        }

        if (flag)
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
