#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, m;
        cin >> n >> m;

        if (((n + m) & 1) == 0)
            cout << "Tonya\n";
        else
            cout << "Burenka\n";
    }

    return 0;
}
