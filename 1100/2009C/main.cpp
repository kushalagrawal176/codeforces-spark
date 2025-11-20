#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;

    while (t--) {
        long long x, y, k;
        cin >> x >> y >> k;

        long long moves_x = x / k + (x % k == 0 ? 0 : 1);
        long long moves_y = y / k + (y % k == 0 ? 0 : 1);

        long long cnt = max(2 * moves_x - 1, 2 * moves_y);

        cout << cnt << "\n";
    }

    return 0;
}
