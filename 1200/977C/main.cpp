#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, k;
    cin >> n >> k;

    vector<int> a(n + 1);
    a[0] = 1;
    for (int i = 1; i <= n; i++) {
        cin >> a[i];
    }

    sort(a.begin(), a.end());

    int ans = -1;

    if (k < n && a[k] == a[k + 1]) {
        ans = -1;
    } else if (k == 0 && a[1] == 1) {
        ans = -1;
    } else {
        ans = a[k];
    }

    cout << ans << "\n";
    return 0;
}
