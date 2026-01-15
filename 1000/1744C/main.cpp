#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        char c;
        cin >> n >> c;

        string s;
        cin >> s;

        // Duplicate the string to handle circular behavior
        s = s + s;

        int ans = 0;
        int last = -1; // last position of 'g'

        // Traverse from right to left
        for (int i = 2 * n - 1; i >= 0; i--) 
        {
            if (s[i] == 'g')
                last = i;
            if (s[i] == c && last != -1)
                ans = max(ans, last - i);
        }

        cout << ans << "\n";
    }

    return 0;
}
