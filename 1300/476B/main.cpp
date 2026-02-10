#include <bits/stdc++.h>
using namespace std;

long long nCr(int n, int r) 
{
    if (r < 0 || r > n) 
        return 0;

    r = min(r, n - r);
    long long res = 1;

    for (int i = 1; i <= r; i++)
        res = res * (n - r + i) / i;

    return res;
}

int main() 
{
    string a, b;
    cin >> a >> b;

    int sum1 = 0, sum2 = 0, k = 0;

    for (int i = 0; i < a.size(); i++) 
    {
        if (a[i] == '+') 
            sum1++;
        else 
            sum1--;

        if (b[i] == '?') 
            k++;
        else if (b[i] == '+') 
            sum2++;
        else 
            sum2--;
    }

    int needed = sum1 - sum2;

    if ((needed + k) % 2 != 0) 
    {
        cout << fixed << setprecision(12) << 0.0 << endl;
        return 0;
    }

    int x = (needed + k) / 2;

    if (x < 0 || x > k) 
    {
        cout << fixed << setprecision(12) << 0.0 << endl;
        return 0;
    }

    long long fav = nCr(k, x);
    double total = pow(2, k);

    cout << fixed << setprecision(12) << fav / total << endl;

    return 0;
}
