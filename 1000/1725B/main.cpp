#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n, d;
    cin >> n >> d;

    vector<int> p(n);
    for (int i = 0; i < n; i++)
        cin >> p[i];

    sort(p.begin(), p.end());

    int k = 0, count = 0;
    for (int i = n - 1; i >= k; i--) 
    {
        if (p[i] > d)
            count++;
        else 
        {
            k += d / p[i];
            if (k <= i)
                count++;
        }
    }

    cout << count << "\n";

    return 0;
}
