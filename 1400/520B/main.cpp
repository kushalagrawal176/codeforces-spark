#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n, m;
    cin >> n >> m;

    int steps = 0;
    while (n < m) 
    {
        steps++;
        if (m % 2 == 1)
            m++;   // if odd, increment to make it even
        else
            m /= 2; // if even, halve it
    }

    cout << steps + (n - m) << "\n";
    
    return 0;
}
