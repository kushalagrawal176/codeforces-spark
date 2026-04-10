#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long a, b;
        cin >> a >> b;

        if (b % 2 == 1) 
        {
            if (a % 2 == 1)
                cout << a * b + 1 << "\n";
            else
                cout << -1 << "\n";
        } 
        else 
        {
            if (b % 4 == 0 || a % 2 == 0)
                cout << a * (b / 2) + 2 << "\n";
            else
                cout << -1 << "\n";
        }
    }

    return 0;
}
