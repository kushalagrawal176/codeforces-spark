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
        string s;
        cin >> s;

        int zero = 0;
        for (char c : s) 
        {
            if (c == '0') 
                zero++;
        }

        if (zero == 1 || zero % 2 == 0)
            cout << "BOB\n";
        else
            cout << "ALICE\n";
    }

    return 0;
}
