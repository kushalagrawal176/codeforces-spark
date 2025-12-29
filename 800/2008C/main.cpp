#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long l, r;
        cin >> l >> r;

        long long cnt = 1;
        long long i = 1;

        while (l < r) 
        {
            cnt++;
            l = l + i;
            i++;
        }

        if (l == r)
            cout << cnt << "\n";
        else if (l > r)
            cout << cnt - 1 << "\n";
    }

    return 0;
}
