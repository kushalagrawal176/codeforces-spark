#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> a(n + 1);

    for (int i = 0; i < n; i++) {
        int x;
        cin >> x;
        a[x] = i + 1;
    }

    long long cnt_a = 0, cnt_b = 0;

    int t;
    cin >> t;
    while (t--) {
        int ele;
        cin >> ele;
        cnt_a += a[ele];
        cnt_b += n - a[ele] + 1;
    }

    cout << cnt_a << " " << cnt_b << "\n";

    return 0;
}
