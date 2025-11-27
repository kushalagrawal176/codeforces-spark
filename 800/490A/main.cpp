#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;

    vector<int> a, b, c; // store indices of students with skill 1, 2, 3

    for (int i = 0; i < n; i++) {
        int k;
        cin >> k;
        if (k == 1) {
            a.push_back(i + 1); // store 1-based index
        } else if (k == 2) {
            b.push_back(i + 1);
        } else {
            c.push_back(i + 1);
        }
    }

    int teams = min({(int)a.size(), (int)b.size(), (int)c.size()});
    cout << teams << "\n";

    for (int i = 0; i < teams; i++) {
        cout << a[i] << " " << b[i] << " " << c[i] << "\n";
    }

    return 0;
}
