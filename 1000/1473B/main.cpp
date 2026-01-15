#include <bits/stdc++.h>
using namespace std;

// Function to compute LCM of two numbers
long long lcm(long long a, long long b) 
{
    return a / __gcd(a, b) * b;
}

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        string a, b;
        cin >> a >> b;

        string a1 = a, b1 = b;

        // Find LCM of lengths
        long long len = lcm(a.size(), b.size());

        // Expand both strings to LCM length
        string A, B;
        for (int i = 0; i < len / a.size(); i++) 
            A += a;
        for (int i = 0; i < len / b.size(); i++) 
            B += b;

        if (A == B)
            cout << A << "\n";
        else
            cout << -1 << "\n";
    }

    return 0;
}
