#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n, q;
    cin >> n >> q;

    vector<int> a(51, 0);
    for (int i = 1; i <= n; i++) 
    {
        int num;
        cin >> num;

        if (a[num] == 0) // If the number hasn't been assigned a position yet
            a[num] = i;
    }

    while (q--) 
    {
        int t;
        cin >> t;

        cout << a[t] << " ";
        int pos = a[t];

        for (int i = 1; i <= 50; i++) 
        {
            if (pos > a[i]) // If the current number is before the queried number it's position increases by 1
                a[i]++;
        }

        a[t] = 1; // Move the queried number to the front
    }

    return 0;
}
