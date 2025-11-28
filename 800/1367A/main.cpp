#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;

    while (t--) 
    {
        string s;
        cin >> s;

        string a;
        a.push_back(s[0]);
        a.push_back(s[1]);

        for (int i = 3; i < (int)s.size(); i += 2)
            a.push_back(s[i]);

        cout << a << "\n";
    }

    return 0;
}
