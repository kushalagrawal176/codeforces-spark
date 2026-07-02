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

        int len = 0;
        for (int i = 0; i < n; i++) 
        {
            if (s[i] == '0')
                len++;
        }

        cout << len << "\n";

        for (int i = 0; i < n; i++) 
        {
            if (s[i] == '0')
                cout << (i + 1) << " ";
        }

        cout << "\n";
    }

    return 0;
}
