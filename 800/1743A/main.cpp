#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        cin >> n;

        int cnt = 10 - n;

        // accepting values is just formality
        for (int i = 1; i <= n; i++) 
        {
            int temp;
            cin >> temp;
        }

        cout << (6 * cnt * (cnt - 1)) / 2 << "\n";
    }

    return 0;
}
