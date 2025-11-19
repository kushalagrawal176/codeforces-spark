#include <iostream>
using namespace std;

int main() {
    int k, n, w;
    cin >> k >> n >> w;

    // total cost of w bananas
    int cost = w * k * (w + 1) / 2;

    if (cost >= n)
        cout << cost - n << endl;  // borrow the difference
    else
        cout << 0 << endl;         // no need to borrow

    return 0;
}
