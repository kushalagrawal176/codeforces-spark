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

        int zero = 0;
        long long sum = 0;  // use long long in case values are large

        for (int i = 0; i < n; i++) 
        {
            int a;
            cin >> a;

            if (a == 0)
                zero++;
            
            sum += a;
        }

        cout << sum + zero << "\n";
    }

    return 0;
}
