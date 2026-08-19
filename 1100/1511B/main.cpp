#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin >> t;

    while(t--) 
    {
        int a, b, c;
        cin >> a >> b >> c;

        // x = 10^(a-1), which is a 1 followed by (a-1) zeros
        string x = "1" + string(a - 1, '0');
        
        // y = 10^(c-1) * (something to make it b digits long)
        // To keep GCD length c, we can use 10^(c-1).
        // To make y have b digits, we can prepend (b-c) ones to it.
        string y = string(b - c + 1, '1') + string(c - 1, '0');

        cout << x << " " << y << endl;
    }

    return 0;
}