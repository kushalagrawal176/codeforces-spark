#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long a, k;
        cin >> a >> k;
        k--; // since we already have the first term

        while (k-- > 0) 
        {
            int mini = 9, maxi = 0;
            long long temp = a;

            while (temp > 0) 
            {
                int digit = temp % 10;

                mini = min(mini, digit);
                maxi = max(maxi, digit);
                temp /= 10;
            }

            if (mini == 0 || maxi == 0) 
                break;
                
            a += (mini * maxi);
        }

        cout << a << "\n";
    }

    return 0;
}
