#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while(t--) 
    {
        int n, a, b;
        cin >> n >> a >> b;

        if((n - b) % 2 == 0 && ((n - a) % 2 == 0 || a <= b))
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
