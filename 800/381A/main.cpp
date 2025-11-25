#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;

    vector<int> arr(n);
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    int left = 0, right = n - 1;
    int turn = 0; // 0 -> Sereja, 1 -> Dima
    int a = 0, b = 0;

    while (left <= right) {
        if (arr[left] >= arr[right]) {
            if (turn == 0)
                a += arr[left];
            else
                b += arr[left];
            left++;
        } else {
            if (turn == 0)
                a += arr[right];
            else
                b += arr[right];
            right--;
        }
        turn ^= 1; // toggle between 0 and 1
    }

    cout << a << " " << b << "\n";
    return 0;
}
