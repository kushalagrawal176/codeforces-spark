#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        cin >> n;
        long long sum = 0;

        // Read first n-2 numbers and accumulate
        for (int i = 0; i < n - 2; i++) 
        {
            long long x;
            cin >> x;

            sum += x;
        }

        // Subtract from the next two numbers
        long long a, b;
        cin >> a >> b;

        sum = a - sum;
        sum = b - sum;

        cout << sum << "\n";
    }

    return 0;
}
