#include <bits/stdc++.h>
using namespace std;

int main() {
    int a, b, c;
    cin >> a >> b >> c;

    int mini = min({a, b, c});
    int maxi = max({a, b, c});

    int ans = INT_MAX;

    for (int i = mini; i <= maxi; i++) {
        int d = abs(a - i);
        int e = abs(b - i);
        int f = abs(c - i);

        ans = min(ans, d + e + f);
    }

    cout << ans << endl;

    return 0;
}
