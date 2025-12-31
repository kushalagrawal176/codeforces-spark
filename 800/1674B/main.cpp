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

        int val = (s[0] - 'a') * 25 + (s[1] - 'a');

        if (s[1] < s[0])
            val++;

        cout << val << "\n";
    }

    return 0;
}
