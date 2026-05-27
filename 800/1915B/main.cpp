#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        string a, b, c;
        cin >> a >> b >> c;

        string f; // Find the string with '?'
        if (a.find('?') != string::npos)
            f = a;
        else if (b.find('?') != string::npos)
            f = b;
        else
            f = c;

        int char_a = 0, char_b = 0, char_c = 0;

        // Count the occurrences of 'A', 'B', and 'C' in the string with '?'
        if (f[0] == 'A' || f[1] == 'A' || f[2] == 'A')
            char_a++;
        if (f[0] == 'B' || f[1] == 'B' || f[2] == 'B')
            char_b++;
        if (f[0] == 'C' || f[1] == 'C' || f[2] == 'C')
            char_c++;

        char ans = 'A';
        if (char_a == 0) 
            ans = 'A';
        if (char_b == 0) 
            ans = 'B';
        if (char_c == 0) 
            ans = 'C';

        cout << ans << "\n";
    }

    return 0;
}
