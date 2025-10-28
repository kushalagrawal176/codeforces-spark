#include <iostream>
using namespace std;

int main() {
    int n, m;
    cin >> n >> m;

    if (m % n != 0) {
        cout << "-1" << endl;
    } else {
        int factor = m / n;
        int cnt = 0;

        while (factor > 1) {
            int check = factor;

            if (factor % 3 == 0) {
                cnt++;
                factor /= 3;
            }
            if (factor % 2 == 0) {
                cnt++;
                factor /= 2;
            }

            if (check == factor) {
                cnt = -1;
                break;
            }
        }

        cout << cnt << endl;
    }

    return 0;
}