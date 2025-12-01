#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;  // number of test cases

    while (t--) 
    {
        int n;
        cin >> n;

        long long prod = 1;       // product of all numbers
        vector<int> a(10, 0);     // frequency array for digits 0–9

        // Read input numbers
        for (int i = 0; i < n; i++) 
        {
            int num;
            cin >> num;
            a[num]++;
            prod *= num;
        }

        long long maxi = 1;

        // Case 1: If there are at least two zeros, product is always 0
        if (a[0] >= 2) 
        {
            maxi = 0;
        }
        // Case 2: If there is exactly one zero, product is formed by non-zero numbers only
        else if (a[0] == 1) 
        {
            maxi = 1;
            for (int i = 1; i <= 9; i++) 
            {
                if (a[i] > 0) 
                {
                    // multiply i raised to its frequency
                    for (int k = 0; k < a[i]; k++) 
                    {
                        maxi *= i;
                    }
                }
            }
        }
        // Case 3: No zeros, try replacing one element i with (i+1) to maximize product
        else 
        {
            for (int i = 1; i <= 9; i++) 
            {
                if (a[i] > 0) 
                {
                    long long candidate = (prod / i) * (i + 1);
                    maxi = max(maxi, candidate);
                }
            }
        }

        cout << maxi << "\n";
    }

    return 0;
}
