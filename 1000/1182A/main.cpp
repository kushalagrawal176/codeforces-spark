#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int n;
    cin >> n;

    if ((n & 1) == 1)
        cout << 0;
    else
        cout << (int)pow(2, n / 2);

    return 0;
}
