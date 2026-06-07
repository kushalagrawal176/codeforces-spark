#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, k;
        cin >> n >> k;

        string s;
        cin >> s;

        vector<int> f1(26, 0); // lowercase frequencies
        vector<int> f2(26, 0); // uppercase frequencies

        // Count frequency of each character
        for (char c : s) 
        {
            if (c >= 'A' && c <= 'Z')
                f2[c - 'A']++;
            else
                f1[c - 'a']++;
        }

        int cnt = 0;
        for (int i = 0; i < 26; i++) 
        {
            int m = min(f1[i], f2[i]);
            cnt += m;

            f1[i] -= m;
            f2[i] -= m;

            // Pair up remaining characters using k operations
            int extraPairs = min(k, (f1[i] + f2[i]) / 2);
            cnt += extraPairs;
            k -= extraPairs;

            if (k < 0) 
                k = 0;
        }

        cout << cnt << "\n";
    }

    return 0;
}
