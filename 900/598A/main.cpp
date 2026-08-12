#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while(t--) 
    {
        long long n;
        cin >> n;

        // Total sum from 1 to n using the formula: n * (n + 1) / 2
        long long sum = (n * (n + 1)) / 2;

        // Subtract powers of 2 twice (once for not adding them, and once because they were added in the total sum)
        for(long long i = 1; i <= n; i *= 2)
            sum -= 2 * i;

        cout<<sum<<"\n";
    }

    return 0;
}