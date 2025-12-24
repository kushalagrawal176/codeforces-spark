#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        string s;
        cin >> s;
        
        s = 'R' + s + 'R';

        int maxi = -1; // to store the maximum distance between 'R's
        int prev = 0; // to store the index of the last 'R' found

        for (int i = 1; i < s.length(); i++) 
        {
            if (s[i] == 'R') 
            {
                maxi = max(maxi, i - prev);
                prev = i;
            }
        }

        cout << maxi << "\n";
    }
    return 0;
}
