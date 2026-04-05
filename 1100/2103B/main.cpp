#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        string s;
        cin >> n >> s;

        int change = 0;

        if (s[0] == '1')
            change++;

        for (int i = 1; i < n; i++) 
        {
            if (s[i] != s[i - 1])
                change++;
        }

        if (change == 2)
            change = 1;
        if (change > 2)
            change -= 2;

        cout << n + change << "\n";
    }

    return 0;
}
