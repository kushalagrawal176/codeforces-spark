#include <bits/stdc++.h>
using namespace std;

int main() {
    int a, b;
    cin >> a >> b;

    // First number: number of days Vasya can wear different socks
    // Second number: number of days he can wear same socks afterwards
    cout << min(a, b) << " " << (max(a, b) - min(a, b)) / 2 << "\n";

    return 0;
}
