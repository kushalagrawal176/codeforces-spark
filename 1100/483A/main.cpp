#include<bits/stdc++.h>
using namespace std;

int main() 
{
    long long l, r;
    cin >> l >> r;

    // Check if there are at least three consecutive integers in the range [l, r]
    // If not, print -1
    // If the range is too small or not even, we can't find three consecutive even numbers
    // So we need to check the conditions
    if(r - l <= 1 || (r - l == 2 && l % 2 == 1))
        cout << -1 << "\n";
    else 
    {
        // Find the first even number greater than or equal to l
        if (l % 2 == 1)
            l++;
        cout << l << " " << (l + 1) << " " << (l + 2) << "\n";
    }

    return 0;
}