#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n, m, a, b;
    cin >> n >> m >> a >> b;

    int cost = 0;

    if (n % m != 0)
        cost += (n % m) * a;

    int result = min(n * a, min(cost + (n / m) * b, (n / m + 1) * b));

    cout << result << endl;

    return 0;
}
