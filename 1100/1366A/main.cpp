#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t; // Read number of test cases

    while (t--) {
        long long a, b;
        cin >> a >> b; // Read the number of sticks (a) and diamonds (b)

        /*
         Problem statement:
         - You can craft either:
             * Shovel → needs 2 sticks + 1 diamond
             * Sword  → needs 1 stick + 2 diamonds
         - Goal: maximize the total number of tools crafted.

         Key observation:
         - Each tool consumes exactly 3 resources in total.
         - So the maximum number of tools possible is limited by:
             1. The smaller of a and b (since one resource may run out first).
             2. The total resources divided by 3 ((a+b)/3).

         Therefore, the answer is min(a, b, (a+b)/3).
        */

        cout << min({a, b, (a + b) / 3}) << "\n";
    }

    return 0;
}
