#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, k;
        cin >> n >> k;

        vector<int> a(n);
        for (int i = 0; i < n; i++)
            cin >> a[i];

        int l = a[k - 1];   // element at position k (1-indexed)
        sort(a.begin(), a.end());

        int pos = -1;
        for (int i = 0; i < n; i++) 
        {
            if (a[i] == l) 
            {
                pos = i;
                break;
            }
        }

        string s = "Yes";
        for (int j = pos; j < n - 1; j++) 
        {
            if (a[j + 1] - a[j] > l) 
            {
                s = "No";
                break;
            }
        }

        cout << s << "\n";
    }

    return 0;
}
