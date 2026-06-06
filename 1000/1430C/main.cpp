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

        // answer will always be 2
        cout << 2 << "\n";  
        int a = n;
        int b = n - 1;

        // Generate pairs 
        // a = n, b = n - 1
        for (int i = 1; i < n; i++) 
        {
            cout << a << " " << b << "\n";
            a = (int)ceil((a + b) / 2.0);
            b = n - 1 - i;
        }
    }

    return 0;
}
