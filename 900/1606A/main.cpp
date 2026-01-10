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

        // Print all characters except the last one
        for (int i = 0; i < (int)s.size() - 1; i++) 
            cout << s[i];

        // Print the first character at the end
        cout << s[0] << "\n";
    }

    return 0;
}
