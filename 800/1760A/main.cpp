#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        int a, b, c;
        cin >> a >> b >> c;

        // Medium number = sum - max - min
        cout << (a + b + c - max({a, b, c}) - min({a, b, c})) << "\n";
    }

    return 0;
}