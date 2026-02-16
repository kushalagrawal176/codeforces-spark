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

        vector<int> freq(101, 0);
        bool flag = false;

        for (int i = 0; i < n; i++) 
        {
            int a;
            cin >> a;
            freq[a]++;

            if (freq[a] > 1)
                flag = true;
        }

        if (flag)
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
