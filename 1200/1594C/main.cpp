#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        char ch;
        cin >> n >> ch;

        string s;
        cin >> s;

        int x = 0, op = 0;
        for (int i = 0; i < n; i++) 
        {
            if (s[i] == ch) 
            {
                op++;
                x = i + 1; // store last position (1-based)
            }
        }

        if (op == n)
            cout << 0 << "\n";
        else if (x > n / 2)
            cout << 1 << "\n" << x << "\n";
        else
            cout << 2 << "\n" << n << " " << n - 1 << "\n";
    }

    return 0;
}
