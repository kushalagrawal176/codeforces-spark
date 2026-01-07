#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long a, b, c;
        cin >> a >> b >> c;

        // Case 1: Check if b can be the average of a and c
        if ((a + c) % 2 == 0 && ((a + c) / 2) % b == 0)
            cout << "YES\n";

        // Case 2: Check if we can adjust c to make AP
        else if (2 * b - a > 0 && (2 * b - a) % c == 0)
            cout << "YES\n";
        
        // Case 3: Check if we can adjust a to make AP
        else if (2 * b - c > 0 && (2 * b - c) % a == 0)
            cout << "YES\n";
        
        else
            cout << "NO\n";
    }

    return 0;
}
