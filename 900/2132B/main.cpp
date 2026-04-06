#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long n;
        cin >> n;

        long long d = 10;
        long long c = 0;

        vector<long long> arr;

        while (n / (d + 1) > 0) 
        {
            if (n % (d + 1) == 0) 
            {
                c++;
                arr.insert(arr.begin(), n / (d + 1));
            }

            d *= 10;
        }

        cout << c << "\n";
        for (auto x : arr)
            cout << x << " ";

        if (c > 0) 
            cout << "\n";
    }

    return 0;
}
