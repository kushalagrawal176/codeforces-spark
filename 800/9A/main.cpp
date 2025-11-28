#include <bits/stdc++.h>
using namespace std;

int main() {
    int Y, W;
    cin >> Y >> W;

    string probability[] = {"", "1/1", "5/6", "2/3", "1/2", "1/3", "1/6"};
    int d = max(Y, W);

    cout << probability[d] << "\n";

    return 0;
}
