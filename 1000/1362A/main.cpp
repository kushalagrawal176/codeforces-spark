#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long a, b;
        cin >> a >> b;

        long long cnt = 0;

        if (a > b) 
            swap(a, b);

        while (a < b) 
        {
            a <<= 1; // multiply by 2
            cnt++;
        }

        if (a > b) {
            cout << -1 << "\n";
        } else {
            cout << (cnt + 2) / 3 << "\n"; 
        }
    }

    return 0;
}
