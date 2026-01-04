#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long a, b, c;
        cin >> a >> b >> c;

        long long sum = a + b + c;

        if (sum % 3 != 0)
            cout << "NO\n";
        else 
        {
            long long avg = sum / 3;

            if (a > avg || b > avg)
                cout << "NO\n";
            else
                cout << "YES\n";
        }
    }

    return 0;
}
