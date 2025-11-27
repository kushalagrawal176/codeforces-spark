#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t; // Number of test cases

    while (t--) 
    {
        int n;
        cin >> n; // Size of the array to reconstruct

        // Total number of pairwise sums = nC2 = n*(n-1)/2
        int m = (n * (n - 1)) / 2;

        vector<int> a(m);
        for (int i = 0; i < m; i++) {
            cin >> a[i]; // Input all pairwise sums
        }

        // Sort the pairwise sums
        sort(a.begin(), a.end());

        // Reconstruct the array:
        // After sorting, every (--n)-th step gives us the next element
        for (int i = 0; i < m; i += (--n)) {
            cout << a[i] << " ";
        }

        // Append a large number (1e9) as the last element
        cout << 1000000000 << "\n";
    }

    return 0;
}
