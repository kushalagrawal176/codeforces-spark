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

        int odd = 0, even = 0;

        for (int i = 0; i < n; i++) 
        {
            int a;
            cin >> a;
            if ((i % 2) == (a % 2)) {
                continue;
            } else if ((i % 2) == 0) {
                odd++;
            } else {
                even++;
            }
        }

        if (even == odd)
            cout << even << "\n";
        else
            cout << -1 << "\n";
    }

    return 0;
}
