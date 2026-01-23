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

        vector<long long> a(n);
        for (int i = 0; i < n; i++)
            cin >> a[i];

        long long sumOdd = 0, sumEven = 0;
        for (int i = 0; i < n; i++) 
        {
            if (i % 2 == 0)
                sumOdd += a[i]; // 1-based odd index
            else
                sumEven += a[i]; // 1-based even index
        }

        long long countOdd = (n + 1LL) / 2;
        long long countEven = n / 2LL;

        if (sumOdd % countOdd != 0 || sumEven % countEven != 0)
            cout << "NO\n";
        else 
        {
            long long valOdd = sumOdd / countOdd;
            long long valEven = sumEven / countEven;
            cout << (valOdd == valEven ? "YES\n" : "NO\n");
        }
    }

    return 0;
}
