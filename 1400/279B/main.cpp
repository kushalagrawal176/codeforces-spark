#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n, t;
    cin >> n >> t;

    vector<int> a(n);
    for (int i = 0; i < n; i++)
        cin >> a[i];

    int ans = 0, sum = 0, j = 0;

    for (int i = 0; i < n; i++) 
    {
        sum += a[i];
        while (sum > t) 
        {
            sum -= a[j];
            j++;
        }
        
        ans = max(ans, i - j + 1);
    }

    cout << ans << "\n";
    return 0;
}
