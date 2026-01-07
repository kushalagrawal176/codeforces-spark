#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;
    
    while (t--) 
    {
        string s;
        cin >> s;

        int a = 0; // count of '0'
        for (char ch : s) 
        {
            if (ch == '0') 
                a++;
        }

        int b = (int)s.size() - a; // count of '1'

        if (a == b && (a % 2 == 0))
            cout << "NET\n";
        else if (a == b && (a % 2 == 1))
            cout << "DA\n";
        else 
        {
            if (min(a, b) % 2 == 0)
                cout << "NET\n";
            else
                cout << "DA\n";
        }
    }

    return 0;
}
