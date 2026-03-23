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

        if (s[0] == s[n - 1])
            cout << (s[0] == 'A' ? "Alice" : "Bob") << "\n";
        else 
        {
            int b = 0;
            for (int i = 0; i < n; i++) 
            {
                if (s[i] == 'B') 
                    b++;
            }

            if (s[n - 1] == 'A' && s[n - 2] == 'A')
                cout << "Alice\n";
            else if (b == 1 && s[n - 1] == 'B')
                cout << "Alice\n";
            else
                cout << "Bob\n";
        }
    }

    return 0;
}
