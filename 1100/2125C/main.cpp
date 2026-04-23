#include <bits/stdc++.h>
using namespace std;

long long solve(long long n) 
{
    return (n - n/2 - n/3 - n/5 - n/7
            + n/6 + n/15 + n/10 + n/14 + n/21 + n/35
            - n/70 - n/42 - n/30 - n/105
            + n/210);
}

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long n, m;
        cin >> n >> m;
        cout << solve(m) - solve(n - 1) << "\n";
    }
    
    return 0;
}
