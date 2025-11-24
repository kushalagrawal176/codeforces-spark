#include <bits/stdc++.h>
using namespace std;

int main() {
    string a, b, c;
    cin >> a >> b >> c;

    map<char, int> mp; // we can use constant size array (=26) as well since input is only lowercase letters

    // Count characters from string a
    for (char ch : a) {
        mp[ch]++;
    }

    // Count characters from string b
    for (char ch : b) {
        mp[ch]++;
    }

    // Subtract characters from string c
    bool flag = true;
    for (char ch : c) {
        if (mp[ch] > 0) {
            mp[ch]--;
        } else {
            flag = false;
            break;
        }
    }

    // Check if all counts are zero
    for (auto it : mp) {
        if (it.second > 0) {
            flag = false;
            break;
        }
    }

    if (flag) {
        cout << "YES" << endl;
    } else {
        cout << "NO" << endl;
    }

    return 0;
}
