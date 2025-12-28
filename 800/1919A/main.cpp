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

        if (((abs(a - b) + 1) % 2) == 0)
            cout << "Alice\n";
        else
            cout << "Bob\n";
    }

    return 0;
}
