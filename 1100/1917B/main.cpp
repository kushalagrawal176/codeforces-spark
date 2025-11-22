#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;

    while (t--) {
        int n;
        cin >> n;
        string s;
        cin >> s;

        long long cnt = 0;
        vector<int> freq(26, 0);

        for (int i = 0; i < n; i++) {
            if (freq[s[i] - 'a'] > 0)
                continue;

            freq[s[i] - 'a'] = 1;
            cnt += (n - i);
        }

        cout << cnt << "\n";
    }

    return 0;
}
