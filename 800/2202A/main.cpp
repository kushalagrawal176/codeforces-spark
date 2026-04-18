#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int x, y;
        cin >> x >> y;

        int sum = x + y;

        if (sum >= 0 && sum % 3 == 0 && sum / 3 >= abs(y))
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
