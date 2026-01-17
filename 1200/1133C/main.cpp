#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin >> n;

    vector<int> a(n);
    for (int i = 0; i < n; i++)
        cin >> a[i];

    sort(a.begin(), a.end());

    int maxi = INT_MIN;
    int l = 0, r = 1;

    while (r < n) 
    {
        if (a[r] - a[l] > 5) 
        {
            maxi = max(maxi, r - l);
            while (l <= r && a[r] - a[l] > 5)
                l++;
        }
        
        r++;
    }
    maxi = max(maxi, r - l);

    cout << maxi << "\n";

    return 0;
}
