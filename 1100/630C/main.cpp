#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin >> n;

    long long a[56];
    a[0] = 1;
    for (int i = 1; i < 56; i++) 
        a[i] = 2 * a[i - 1];

    long long sum = 0;
    for (int i = 1; i <= n; i++)
        sum += a[i];

    cout << sum << "\n";

    return 0;
}
