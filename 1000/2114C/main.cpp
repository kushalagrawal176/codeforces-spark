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

        int curr, count = 0;
        cin >> curr;

        for (int i = 1; i < n; i++) 
        {
            int x;
            cin >> x;

            if (x - curr > 1) 
            {
                count++;
                curr = x;
            }
        }

        cout << count + 1 << "\n";
    }

    return 0;
}
