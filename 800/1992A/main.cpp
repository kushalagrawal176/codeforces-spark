#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int a, b, c;
        cin >> a >> b >> c;

        // Perform 5 increments
        for (int i = 1; i <= 5; i++) 
        {
            if (a <= b && a <= c)
                a++;
            else if (b <= c && b <= a)
                b++;
            else
                c++;
        }

        cout << 1LL * a * b * c << "\n";
    }

    return 0;
}
