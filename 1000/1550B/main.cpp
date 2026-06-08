#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, a, b;
        cin >> n >> a >> b;

        string s;
        cin >> s;

        if (b >= 0) {
            cout << (a * n + b * n) << "\n";
        } else {
            int cnt = 1;
            for (int i = 1; i < n; i++) {
                if (s[i] != s[i - 1]) {
                    cnt++;
                }
            }

            cnt = cnt / 2 + 1;
            cout << max(a * n + b * cnt, (a + b) * n) << "\n";
        }
    }

    return 0;
}
