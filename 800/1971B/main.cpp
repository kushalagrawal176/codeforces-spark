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

        vector<char> ch(s.begin(), s.end());

        int i = 0;
        while (i < (int)s.size() && s[i] == s[0])
            i++;

        if (i == (int)s.size()) 
        {
            cout << "NO\n";
        } 
        else 
        {
            swap(ch[0], ch[i]);
            cout << "YES\n";
            for (char c : ch) 
                cout << c;
            cout << "\n";
        }
    }

    return 0;
}
