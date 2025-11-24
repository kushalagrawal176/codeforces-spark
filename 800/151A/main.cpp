#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, k, l, c, d, p, nl, np;
    cin >> n >> k >> l >> c >> d >> p >> nl >> np;

    // Total drink in milliliters
    int totalDrink = k * l;
    // Number of toasts possible from drink
    int drinkToasts = totalDrink / (n * nl);

    // Number of toasts possible from limes
    int limeToasts = (c * d) / n;

    // Number of toasts possible from salt
    int saltToasts = p / (n * np);

    // Minimum of all three gives the answer
    int result = min({drinkToasts, limeToasts, saltToasts});

    cout << result << endl;

    return 0;
}
