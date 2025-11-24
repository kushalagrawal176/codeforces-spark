#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, k;
    cin >> n >> k;

    // Maximum "sum of indices" that can fit in the remaining time
    int prob = ((240 - k) * 2) / 5;

    // Reduce n until the total time required fits within prob
    while (n * (n + 1) > prob) {
        n--;
    }

    cout << n << endl;

    return 0;
}
