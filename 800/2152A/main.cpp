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
        int cnt = 0;

        for (int i = 0; i < n; i++) 
        {
            int a;
            cin >> a;

            if (freq[a] == 0) 
                cnt++;
            
            freq[a]++;
        }

        cout << 2 * cnt - 1 << "\n";
    }

    return 0;
}
