#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        cin >> n;

        long long one = 0, zero = 0;

        for (int i = 0; i < n; i++) 
        {
            int a;
            cin >> a;

            if (a == 0) 
                zero++;
            if (a == 1) 
                one++;
        }

        // Result = one * 2^zero
        long long result = one * (1LL << zero); 
        cout << result << "\n";
    }

    return 0;
}
