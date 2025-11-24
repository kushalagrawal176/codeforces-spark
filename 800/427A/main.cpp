#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;

    int police = 0;
    int crime = 0;
    int cnt = 0;

    for (int i = 0; i < n; i++) {
        int a;
        cin >> a;

        if (a == -1) {
            crime++;
        } else {
            police += a;
        }

        if (crime > police) {
            cnt++;
            crime--;
        } else if (crime > 0) {
            police -= crime;
            crime = 0;
        }
    }

    cout << cnt << endl;

    return 0;
}
