#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin >> n;

    int one = 0, two = 0, three = 0, four = 0;

    for (int i = 0; i < n; i++) 
    {
        int t;
        cin >> t;

        if (t == 1) 
            one++;
        else if (t == 2) 
            two++;
        else if (t == 3) 
            three++;
        else 
            four++;
    }

    int taxi = four + three + (two + 1) / 2;
    one -= three;

    if (two % 2 > 0) 
        one -= 2;
    if (one > 0) 
        taxi += (one + 3) / 4;

    cout << taxi << "\n";

    return 0;
}
