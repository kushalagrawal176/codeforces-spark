#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t; // number of test cases

    while (t--) 
    {
        int n, k;
        cin >> n >> k;

        int cnt = 0;
        long long sum = 0; // sum can grow large, so use long long

        for (int i = 0; i < n; i++) 
        {
            int a;
            cin >> a;

            if (a == 0 && sum > 0) 
            {
                sum--;
                cnt++;
            }
            if (a >= k) 
            {
                sum += a;
            }
        }

        cout << cnt << "\n";
    }

    return 0;
}
