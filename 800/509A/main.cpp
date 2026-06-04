#include <bits/stdc++.h>
using namespace std;

// Function to compute nCr
long long nCr(int n, int r) 
{
    long long res = 1;
    for (int i = 0; i < r; i++) 
    {
        res *= (n - i);
        res /= (i + 1);
    }

    return res;
}

int main() 
{
    int n;
    cin >> n;

    cout << nCr(2*n - 2, n - 1) << endl;
    return 0;
}
