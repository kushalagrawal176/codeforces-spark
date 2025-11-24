#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;

    vector<int> a(n);
    int one = 0; // count of 1s in the original array

    for (int i = 0; i < n; i++) {
        cin >> a[i];
        if (a[i] == 1) one++;

        // Transform the array:
        // - Replace 1 with -1 (flipping it would be a loss)
        // - Replace 0 with +1 (flipping it would be a gain)
        if (a[i] == 1) a[i] = -1;
        else a[i] = 1;
    }

    // Edge case: if all elements are 1, flipping any subarray reduces count
    if (one == n) {
        cout << one - 1 << "\n";
    }
    // Edge case: if all elements are 0, flipping the whole array gives all 1s
    else if (one == 0) {
        cout << n << "\n";
    }
    else {
        // Apply Kadane’s algorithm to find maximum subarray sum
        // This represents the maximum net gain achievable by flipping one segment
        int sum = INT_MIN;
        int s = 0;
        for (int i = 0; i < n; i++) {
            s = max(a[i], s + a[i]); // either start new subarray or extend previous
            sum = max(sum, s);       // track best sum so far
        }

        // Final answer = original count of 1s + best gain
        cout << one + sum << "\n";
    }

    return 0;
}
