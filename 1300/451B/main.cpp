#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin >> n;
    vector<int> a(n + 1);

    for (int i = 1; i <= n; i++)
        cin >> a[i];

    int i = 1, j, k;

    while (i < n && a[i] < a[i + 1]) 
        i++;

    j = i;
    while (j < n && a[j] > a[j + 1]) 
        j++;

    k = j;
    while (k < n && a[k] < a[k + 1]) 
        k++;

    if (k == n) 
    {
        bool f = true;
        if (i > 1 && a[j] < a[i - 1]) 
            f = false;

        if (j < n && a[i] > a[j + 1]) 
            f = false;

        if (f) 
        {
            cout << "yes\n";
            cout << i << " " << j << "\n";
        } 
        else
            cout << "no\n";
    } 
    else
        cout << "no\n";

    return 0;
}
