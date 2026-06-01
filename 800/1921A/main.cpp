#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int x1, y1, x2, y2, x3, y3, x4, y4;
        cin >> x1 >> y1 >> x2 >> y2 >> x3 >> y3 >> x4 >> y4;

        int ans = 0;

        if (x1 == x2)
            ans = (y1 - y2) * (y1 - y2);
        else if (x1 == x3)
            ans = (y1 - y3) * (y1 - y3);
        else if (x1 == x4)
            ans = (y1 - y4) * (y1 - y4);

        cout << ans << "\n";
    }

    return 0;
}
