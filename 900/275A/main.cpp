#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int a[5][5], b[5][5];

    // Initialize grid
    for (int i = 1; i < 4; i++) 
    {
        for (int j = 1; j < 4; j++) 
        {
            a[i][j] = 1;          // all lights initially on
            cin >> b[i][j];       // number of presses
        }
    }

    // Apply presses
    for (int i = 1; i < 4; i++) 
    {
        for (int j = 1; j < 4; j++) 
        {
            if ((b[i][j] & 1) == 0) 
                continue; // only odd presses matter

            a[i][j] ^= 1;
            a[i - 1][j] ^= 1;
            a[i + 1][j] ^= 1;
            a[i][j - 1] ^= 1;
            a[i][j + 1] ^= 1;
        }
    }

    // Output final grid
    for (int i = 1; i < 4; i++) 
    {
        for (int j = 1; j < 4; j++) 
        {
            cout << a[i][j];
        }
        cout << "\n";
    }

    return 0;
}
