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

        int index1 = -1, index2 = -1;

        for (int i = 0; i < n; i++) 
        {
            if (s[i] == 'B') 
            {
                if (index1 == -1)
                    index1 = i;
                else
                    index2 = i;
            }
        }

        if (index2 == -1)
            cout << 1 << "\n";
        else
            cout << index2 - index1 + 1 << "\n";
    }

    return 0;
}
