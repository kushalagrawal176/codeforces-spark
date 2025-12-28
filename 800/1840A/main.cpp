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

        string a = "";
        int ptr = 0;
        int i = 1;

        while (i < n)
        {
            if (s[i] == s[ptr]) 
            {
                a += s[i];
                ptr = i + 1;
                i++;
            }
            i++;
        }

        cout << a << "\n";
    }

    return 0;
}
