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

        if (s.size() == 2) 
        {
            // If the number has exactly 2 digits, output the second digit
            cout << s[1] << "\n";
        } 
        else 
        {
            // Otherwise, output the smallest digit in the string
            char mn = *min_element(s.begin(), s.end());
            cout << mn << "\n";
        }
    }

    return 0;
}
