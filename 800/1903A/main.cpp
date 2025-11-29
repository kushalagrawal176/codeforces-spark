#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, k;
        cin >> n >> k;

        int prev, next;
        cin >> prev;
        bool flag = true;

        for (int i = 1; i < n; i++) 
        {
            cin >> next;
            if (prev > next) {
                flag = false;
            }
            prev = next;
        }

        if (flag || k > 1)
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
