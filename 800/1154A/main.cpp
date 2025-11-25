#include <bits/stdc++.h>
using namespace std;

int main() {
    int a, b, c, d;
    cin >> a >> b >> c >> d;

    int maxi = max({a, b, c, d});

    if (maxi == a)
        cout << (maxi - b) << " " << (maxi - c) << " " << (maxi - d) << "\n";
    else if (maxi == b)
        cout << (maxi - a) << " " << (maxi - c) << " " << (maxi - d) << "\n";
    else if (maxi == c)
        cout << (maxi - b) << " " << (maxi - a) << " " << (maxi - d) << "\n";
    else
        cout << (maxi - b) << " " << (maxi - c) << " " << (maxi - a) << "\n";

    return 0;
}
