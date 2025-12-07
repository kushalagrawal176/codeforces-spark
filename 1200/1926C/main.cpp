#include <bits/stdc++.h>
using namespace std;

int main() 
{
    // Precompute prefix sums of digit sums up to 200000
    const int MAXN = 200000;
    vector<long long> a(MAXN + 1, 0);

    for (int i = 1; i <= MAXN; i++) 
    {
        long long sum = 0;
        int k = i;
        while (k > 0) 
        {
            sum += k % 10;
            k /= 10;
        }
        a[i] = sum + a[i - 1];
    }

    int t;
    cin >> t;
    while (t--) 
    {
        int n;
        cin >> n;
        cout << a[n] << "\n";
    }

    return 0;
}
