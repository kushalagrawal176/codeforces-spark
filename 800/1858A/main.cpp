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

        a += c / 2;
        b += c / 2;

        if (c % 2 == 1)
            a++;

        if (a > b)
            cout << "First\n";
        else
            cout << "Second\n";
    }
    return 0;
}
