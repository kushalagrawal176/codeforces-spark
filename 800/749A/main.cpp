#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin >> n;

    int cnt = n / 2;
    cout << cnt << "\n";

    for (int i = 1; i < cnt; i++) 
    {
        cout << 2 << " ";
    }

    if (n % 2 == 1)
        cout << 3 << "\n";
    else
        cout << 2 << "\n";

    return 0;
}
