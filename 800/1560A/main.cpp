#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int k;
        cin >> k;

        int i = 1;
        for (int j = 2; j <= k; j++) {
            i++;
            if (i % 3 == 0 || i % 10 == 3) {
                while (i % 3 == 0 || i % 10 == 3) {
                    i++;
                }
            }
        }
        cout << i << "\n";
    }

    return 0;
}
