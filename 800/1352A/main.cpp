#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;

    while (t--) {
        int n;
        cin >> n;

        vector<int> parts;
        int i = 0;

        while (n != 0) {
            int digit = n % 10;
            if (digit != 0) {
                parts.push_back(digit * (int)pow(10, i));
            }
            i++;
            n /= 10;
        }

        cout << parts.size() << endl;
        for (int x : parts) {
            cout << x << " ";
        }
        cout << endl;
    }

    return 0;
}
