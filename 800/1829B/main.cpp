#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;

    while (t--) {
        int n;
        cin >> n;

        int zero = 0;   // longest streak of zeros
        int cnt = 0;    // current streak

        for (int i = 0; i < n; i++) {
            int a;
            cin >> a;
            if (a == 0) {
                cnt++;
            } else {
                zero = max(zero, cnt);
                cnt = 0;
            }
        }

        cout << max(zero, cnt) << "\n";
    }

    return 0;
}
