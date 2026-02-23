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

        for (int i = 0; i < n; i++) 
        {
            int x;
            cin >> x;
            freq[x]++;
        }

        int cnt = 0;
        for (int i = 0; i <= 100; i++)
        {
            if (freq[i] == 0 || freq[i] == i) 
                continue;

            if (freq[i] < i)
                cnt += freq[i];
            else
                cnt += freq[i] - i;
        }

        cout << cnt << "\n";
    }

    return 0;
}
