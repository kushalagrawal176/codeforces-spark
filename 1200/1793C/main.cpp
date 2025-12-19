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
        vector<int> a(n);

        for (int i = 0; i < n; i++)
            cin >> a[i];

        int i = 0;
        int j = n - 1;
        int p = 1;
        int q = n;

        while (i < j) 
        {
            if (a[i] == p) 
            {
                p++;
                i++;
            } 
            else if (a[i] == q) 
            {
                q--;
                i++;
            } 
            else if (a[j] == p) 
            {
                p++;
                j--;
            } 
            else if (a[j] == q) 
            {
                q--;
                j--;
            } 
            else
                break;
        }

        if (i == j)
            cout << -1 << "\n";
        else
            cout << (i + 1) << " " << (j + 1) << "\n";
    }

    return 0;
}
