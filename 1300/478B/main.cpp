#include <bits/stdc++.h>
using namespace std;

int main() 
{
    long long n, m;
    cin >> n >> m;

    long long r = n % m;
    long long d = n / m;
    long long num = n - m + 1;

    // Minimum number of pairs
    long long minPairs = ((d * (d - 1)) / 2) * (m - r) + ((d + 1) * d) / 2 * r;

    // Maximum number of pairs
    long long maxPairs = (num * (num - 1)) / 2;

    cout << minPairs << " " << maxPairs << "\n";

    return 0;
}
