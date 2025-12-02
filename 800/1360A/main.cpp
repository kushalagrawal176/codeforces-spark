#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int a, b;
        cin >> a >> b;

        int minSide = min(a, b);
        int maxSide = max(a, b);

        int s = max(2 * minSide, maxSide);

        cout << s * s << "\n";
    }
    return 0;
}
