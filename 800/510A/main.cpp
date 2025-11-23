#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, m;
    cin >> n >> m;

    int dir = 1; // direction flag

    for (int i = 1; i <= n; i++) {
        string s = "";
        if (i % 2 == 0) {
            // even row
            for (int j = 1; j < m - 1; j++) {
                s += '.';
            }
            if (dir == 1) {
                s = '.' + s + '#';
            } else {
                s = '#' + s + '.';
            }
            dir = dir ^ 0 ^ 1; // toggle direction
        } else {
            // odd row
            for (int j = 0; j < m; j++) {
                s += '#';
            }
        }
        cout << s << endl;
    }

    return 0;
}
