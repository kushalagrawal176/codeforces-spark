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

        unordered_map<int, int> mp;
        int freq = INT_MIN;

        for (int i = 0; i < n; i++) 
        {
            int a;
            cin >> a;
            mp[a]++;

            if (freq < mp[a]) 
                freq = mp[a];
        }

        int rem = n - freq;
        int cnt = 0;

        while (rem > 0) 
        {
            cnt++;
            if (rem <= freq) 
            {
                cnt += rem;
                rem = 0;
            } 
            else 
            {
                cnt += freq;
                rem -= freq;
                freq *= 2;
            }
        }

        cout << cnt << "\n";
    }

    return 0;
}
