#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        string st;
        cin >> st;

        // Reverse the string
        reverse(st.begin(), st.end());

        // Swap 'p' with 'q' and vice versa
        for (char &c : st) 
        {
            if (c == 'p') 
                c = 'q';
            else if (c == 'q') 
                c = 'p';
        }

        cout << st << "\n";
    }

    return 0;
}
