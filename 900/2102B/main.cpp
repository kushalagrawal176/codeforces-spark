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

        int first;
        cin >> first;
        first = abs(first);

        int cnt = 0;
        for (int i = 1; i < n; i++) 
        {
            int x;
            cin >> x;

            if (abs(x) < first)
                cnt++;
        }

        cout << (cnt <= n / 2 ? "YES" : "NO") << "\n";
    }

    return 0;
}
