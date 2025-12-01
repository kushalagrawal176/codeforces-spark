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

        // Case 1: If divisible by 3, split evenly
        if (n % 3 == 0) 
        {
            cout << n / 3 << " " << n / 3 << "\n";
        }
        // Case 2: If n can be expressed as (n/3) + 2*(n/3 + 1)
        else if (n / 3 + 2 * (n / 3 + 1) == n) 
        {
            cout << n / 3 << " " << (n / 3 + 1) << "\n";
        }
        // Case 3: Otherwise
        else 
        {
            cout << (n / 3 + 1) << " " << n / 3 << "\n";
        }
    }

    return 0;
}
