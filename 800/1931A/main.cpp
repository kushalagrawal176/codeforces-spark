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

        if (n <= 28)
            cout << "aa" << char(n - 3 + 'a') << "\n";
        else if (n >= 29 && n <= 53)
            cout << "a" << char(n - 28 + 'a') << "z" << "\n";
        else
            cout << char(n - 53 + 'a') << "zz" << "\n";
    }

    return 0;
}
