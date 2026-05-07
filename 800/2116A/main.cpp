#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int a, b, c, d;
        cin >> a >> b >> c >> d;

        int mini = min({a, b, c, d});

        if (mini == b || mini == d)
            cout << "Gellyfish\n";
        else
            cout << "Flower\n";
    }

    return 0;
}
