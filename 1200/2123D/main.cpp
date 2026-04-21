#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, k;
        cin >> n >> k;

        string s;
        cin >> s;

        int one = 0;
        for (char c : s) 
        {
            if (c == '1') 
                one++;
        }

        if (one <= k || n < 2 * k)
            cout << "ALICE\n";
        else
            cout << "BOB\n";
    }

    return 0;
}
