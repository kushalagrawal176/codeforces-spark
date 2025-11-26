#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) 
    {
        int n;
        cin >> n;

        vector<int> a(n);

        for (int i = 0; i < n; i++) {
            cin >> a[i];
        }

        sort(a.begin(), a.end());
        bool flag = true;

        for (int i = n - 1; i >= 1; i--) {
            if (abs(a[i] - a[i - 1]) <= 1) continue;
            else {
                flag = false;
                break;
            }
        }

        if (flag) 
            cout << "YES\n";
        else 
            cout << "NO\n";
    }

    return 0;
}