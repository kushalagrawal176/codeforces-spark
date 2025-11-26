#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, x;
        cin >> n >> x;

        int odd = 0;
        for (int i = 0; i < n; i++) {
            int a;
            cin >> a;
            
            if (a % 2 == 1) 
                odd++;
        }

        if (odd == 0 || (x == n && odd % 2 == 0) || (odd == n && x % 2 == 0))
            cout << "NO\n";
        else
            cout << "YES\n";
    }

    return 0;
}
