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

        // Remove all 'D' characters
        s.erase(remove(s.begin(), s.end(), 'D'), s.end());

        // Check parity of remaining length
        if (s.length() % 2 == 0) 
            cout << "NO\n";
        else
            cout << "YES\n";
    }

    return 0;
}
