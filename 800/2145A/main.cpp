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

        // If divisible by 3, no extra candies needed
        // Otherwise, we need (3 - n % 3) candies
        cout << (n % 3 == 0 ? 0 : 3 - n % 3) << "\n";
    }

    return 0;
}
