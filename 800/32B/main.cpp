#include <bits/stdc++.h>
using namespace std;

int main() {
    string s;
    cin >> s;

    string num = "";
    for (int i = 0; i < (int)s.size(); i++) {
        if (s[i] == '.') {
            num += "0";
        } else if (s[i] == '-' && s[i + 1] == '.') {
            i++;
            num += "1";
        } else if (s[i] == '-' && s[i + 1] == '-') {
            i++;
            num += "2";
        }
    }

    cout << num << "\n";
    return 0;
}
