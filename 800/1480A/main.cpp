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

        int turn = 1; // 1 = Alice's turn, 2 = Bob's turn

        for (int i = 0; i < (int)s.size(); i++) 
        {
            if (turn == 1) 
            {
                // Alice's move
                if (s[i] == 'a')
                    s[i] = 'b';
                else
                    s[i] = 'a';
            } 
            else 
            {
                // Bob's move
                if (s[i] == 'z')
                    s[i] = 'y';
                else
                    s[i] = 'z';
            }

            // Toggle turn between 1 and 2
            turn = (turn == 1 ? 2 : 1);
        }

        cout << s << "\n";
    }

    return 0;
}
