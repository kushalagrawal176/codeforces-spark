#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;

    while (t--) 
    {
        string s;
        cin >> s;

        int cnt = 0;
        if (s[0] != 'a') 
            cnt++;
        if (s[1] != 'b') 
            cnt++;
        if (s[2] != 'c') 
            cnt++;

        if (cnt <= 2)
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
