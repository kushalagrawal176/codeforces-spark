#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin >> n;

    int zero = 0, five = 0;

    for (int i = 0; i < n; i++) 
    {
        int x;
        cin >> x;

        if (x == 0) 
            zero++;
        else 
            five++;
    }

    if (zero == 0)
        cout << -1 << endl;
    else if (five < 9)
        cout << 0 << endl;
    else 
    {
        // Use as many groups of 9 fives as possible
        int groups = five / 9;
        for (int i = 0; i < groups; i++)
            cout << string(9, '5');

        cout << string(zero, '0') << endl;
    }

    return 0;
}
