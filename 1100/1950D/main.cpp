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

        // Try dividing n by all binary decimals from 31 down to 2
        for (int i = 31; i >= 2; i--) 
        {
            // Convert i to its binary string, then to integer
            string bin = bitset<6>(i).to_string(); // 6 bits enough for i up to 31
            // Remove leading zeros
            bin.erase(0, bin.find_first_not_of('0'));
            int a = stoi(bin);

            while (n % a == 0)
                n /= a;
        }

        if (n == 1)
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
