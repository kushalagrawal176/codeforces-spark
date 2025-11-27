#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;

    while (t--) {
        int n;
        cin >> n;

        long long odd = 0;
        for (int i = 0; i < n; i++) {
            int a;
            cin >> a;
            if (a & 1) {   // check if odd
                odd += a;
            }
        }

        if ((odd & 1) == 0)
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
