#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;

    while (t--) {
        string s;
        cin >> s;

        // Convert to lowercase for case-insensitive comparison
        for (auto &ch : s) {
            ch = tolower(ch);
        }

        if (s == "yes") {
            cout << "YES" << endl;
        } else {
            cout << "NO" << endl;
        }
    }

    return 0;
}
