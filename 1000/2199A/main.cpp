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

        int a1, b1, a2, b2;
        cin >> a1 >> b1 >> a2 >> b2;

        int sum1 = a1 + a2;
        int sum2 = b1 + b2;

        string ans;

        if (sum1 > sum2 + k)
            ans = "NO";
        else if (sum1 == sum2 + k) 
        {
            if (a1 > b1 && a2 > b2)
                ans = "NO";
            else
                ans = "YES";
        }
        else if (sum1 + k < sum2)
            ans = "YES";
        else if (sum1 + k == sum2) 
        {
            if (a1 > b1 && a2 > b2)
                ans = "NO";
            else
                ans = "YES";
        }
        else
            ans = "YES";

        cout << ans << '\n';
    }

    return 0;
}