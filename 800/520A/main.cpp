#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    string s;
    cin >> s;

    if (n < 26) {
        cout << "NO\n";
        return 0;
    }

    set<char> letters;
    for (char c : s) {
        letters.insert(tolower(c));
    }

    if (letters.size() == 26)
        cout << "YES\n";
    else
        cout << "NO\n";

    return 0;
}
