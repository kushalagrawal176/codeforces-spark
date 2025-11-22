#include <bits/stdc++.h>
using namespace std;

int main() {
    int a, b, c, d;
    cin >> a >> b >> c >> d;

    set<int> colors = {a, b, c, d};  // store distinct colors
    cout << 4 - colors.size() << "\n";

    return 0;
}
