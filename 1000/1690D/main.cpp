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

        int ans = 1000000;
        int b = 0, w = 0;
        int left = 0, right = 0;

        while (right < n) 
        {
            if (s[right] == 'B')
                b++;
            else
                w++;

            if (b == k) 
            {
                ans = 0;
                break;
            }

            if (b + w == k) 
            {
                ans = min(ans, w);

                if (s[left] == 'B')
                    b--;
                else
                    w--;

                left++;
            }

            right++;
        }

        cout << ans << "\n";
    }

    return 0;
}
