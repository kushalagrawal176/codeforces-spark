#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin >> n;

    const int MAX = 100001;
    vector<int> a(MAX, 0);

    for (int i = 0; i < n; i++) 
    {
        int price;
        cin >> price;
        a[price]++;
    }

    // Prefix sums: a[i] = number of drinks with price ≤ i
    for (int i = 1; i < MAX; i++)
        a[i] += a[i - 1];

    int q;
    cin >> q;

    while (q--) 
    {
        int t;
        cin >> t;

        if (t >= MAX)
            cout << n << "\n";
        else
            cout << a[t] << "\n";
    }

    return 0;
}
