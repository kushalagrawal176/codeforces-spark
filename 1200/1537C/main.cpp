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

        sort(a.begin(), a.end());

        int idx1 = -1;
        int diff = INT_MAX;

        for (int i = 0; i < n - 1; i++) 
        {
            if (diff > a[i + 1] - a[i]) 
            {
                idx1 = i;
                diff = a[i + 1] - a[i];
            }
        }

        cout << a[idx1] << " ";
        for (int i = idx1 + 2; i < n; i++)
            cout << a[i] << " ";
    
        for (int i = 0; i < idx1; i++) 
            cout << a[i] << " ";
        
        cout << a[idx1 + 1] << "\n";
    }
    return 0;
}
