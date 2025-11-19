#include <bits/stdc++.h>
using namespace std;

int main() {
    string s;
    cin >> s;

    int cnt = 0; // count uppercase letters
    for (int i = 0; i < (int)s.length(); i++) {
        if (isupper(s[i])) {
            cnt++;
        }
    }

    // lowercase count = total length - uppercase count
    if (cnt <= (int)s.length() - cnt) {
        // more lowercase letters → convert to lowercase
        for (int i = 0; i < (int)s.length(); i++) {
            s[i] = tolower(s[i]);
        }
    } else {
        // more uppercase letters → convert to uppercase
        for (int i = 0; i < (int)s.length(); i++) {
            s[i] = toupper(s[i]);
        }
    }

    cout << s << endl;
    return 0;
}
