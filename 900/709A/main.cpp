#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n, b, d;
    cin >> n >> b >> d;

    long long sum = 0;
    int ans = 0;

    for (int i = 0; i < n; i++) 
    {
        int x;
        cin >> x;

        if (x <= b)
            sum += x;
        if (sum > d) 
        {
            sum = 0;
            ans++;
        }
    }

    cout << ans << "\n";
    return 0;
}
