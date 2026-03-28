#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int x, y, k;
        cin >> x >> y >> k;

        int num = min(x, y);

        cout << "0 0 " << num << " " << num << "\n";
        cout << num << " 0 0 " << num << "\n";
    }

    return 0;
}
