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

        vector<int> freq(2 * n + 1, 0);

        for (int i = 0; i < 2 * n; i++) 
        {
            int a;
            cin >> a;
            freq[a]++;
        }

        int k = 0, m = 0;
        for (int i = 1; i <= 2 * n; i++) 
        {
            if (freq[i] == 0) 
                continue;

            if (freq[i] & 1) 
                m++;
            else 
                k++;
        }

        if (m == 0) 
        {
            if ((n & 1) != (k & 1))
                cout << 2 * k + m - 2 << "\n";
            else
                cout << 2 * k + m << "\n";
        } 
        else
            cout << 2 * k + m << "\n";
    }

    return 0;
}
