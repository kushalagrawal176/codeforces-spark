#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int a;
        cin >> a;

        if ((a > 101 && a < 110) || (a > 1009 && a < 1100)) 
        {
            cout << "YES\n";
        } 
        else 
        {
            cout << "NO\n";
        }
    }

    return 0;
}
