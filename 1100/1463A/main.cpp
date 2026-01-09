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

        if (sum % 9 == 0 && a >= sum / 9 && b >= sum / 9 && c >= sum / 9)
            cout << "YES\n";
        else
            cout << "NO\n";
    }
    
    return 0;
}
