#include <bits/stdc++.h>
using namespace std;

// Function to compute gcd
int gcd(int a, int b) 
{
    if (b == 0) 
        return a;

    return gcd(b, a % b);
}

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        cin >> n;

        int first;
        cin >> first;
        int k = abs(first - 1);

        for (int i = 2; i <= n; i++) 
        {
            int val;
            cin >> val;
            
            k = gcd(k, abs(val - i));
        }

        cout << k << "\n";
    }

    return 0;
}
