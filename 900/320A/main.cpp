#include <bits/stdc++.h>
using namespace std;

int main() 
{
    long long n;
    cin >> n;

    bool flag = true;

    while (n > 0) 
    {
        if (n % 10 == 1)
            n /= 10;
        else if (n % 100 == 14)
            n /= 100;
        else if (n % 1000 == 144)
            n /= 1000;
        else 
        {
            flag = false;
            break;
        }
    }

    if (flag)
        cout << "YES\n";
    else
        cout << "NO\n";

    return 0;
}
