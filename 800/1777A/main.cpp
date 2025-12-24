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

        int prev;
        cin >> prev;

        int cnt = 0;
        n--;  // one element already read

        while (n-- > 0) 
        {
            int curr;
            cin >> curr;

            if ((curr & 1) == (prev & 1)) 
                cnt++;

            prev = curr;
        }

        cout << cnt << "\n";
    }

    return 0;
}
