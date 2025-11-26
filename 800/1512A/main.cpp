#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        vector<int> a(n);

        int num1 = -1, num2 = -1;
        int cnt1 = 0;
        int index1 = 0, index2 = 0;

        for (int i = 0; i < n; i++) {
            cin >> a[i];

            if (num1 == -1) {
                index1 = i + 1;
                cnt1++;
                num1 = a[i];
            } else if (num1 == a[i]) {
                cnt1++;
            } else {
                index2 = i + 1;
                num2 = a[i];
            }
        }

        if (cnt1 > 1)
            cout << index2 << "\n";
        else
            cout << index1 << "\n";
    }

    return 0;
}
