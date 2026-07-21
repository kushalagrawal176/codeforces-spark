#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int a, b;
        cin >> a >> b;

        int xor_val = 0;
        int n = a - 1;

        // Calculate the XOR value for the range
        // XOR prefix sum from 0 to a-1
        if (n % 4 == 0) 
            xor_val = n;
        else if (n % 4 == 1) 
            xor_val = 1;
        else if (n % 4 == 2) 
            xor_val = n + 1;
        else if (n % 4 == 3) 
            xor_val = 0;

        // Determine the output based on the XOR values
        if(xor_val == b)
            cout << a << "\n";
        else if((xor_val ^ a) == b)
            cout << a + 2 << "\n";
        else
            cout << a + 1 << "\n";
    }

    return 0;
}