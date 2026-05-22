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
        string s;
        cin >> s;

        vector<int> freq(26, 0);
        int balloons = 0;

        for (int i = 0; i < n; i++) 
        {
            if (freq[s[i] - 'A'] == 0)
                balloons++; // first time this balloon color appears

            freq[s[i] - 'A']++;
            balloons++; // every balloon requires one unit of time
        }

        cout << balloons << "\n";
    }

    return 0;
}
