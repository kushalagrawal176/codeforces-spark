#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long n, c;
        cin >> n >> c;

        long long sum = 0;
        long long sum_square = 0;

        for (int i = 0; i < n; i++) 
        {
            long long a;
            cin >> a;
            sum += a;
            sum_square += 1LL * a * a;
        }

        // Using double for calculation to handle sqrt
        double numerator = (-4.0 * sum) + sqrt(pow(4.0 * sum, 2) + 16.0 * n * (c - sum_square));
        double w1 = numerator / (8.0 * n) + 0.5;

        cout << (long long)floor(w1) << "\n";
    }

    return 0;
}
