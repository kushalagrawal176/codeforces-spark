#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long n;
        cin >> n;

        long long sum = 0;

        while (n != 1) 
        {
            sum += n;
            n /= 2;
        }

        sum++;  // add the root node (1)
        cout << sum << "\n";
    }

    return 0;
}
