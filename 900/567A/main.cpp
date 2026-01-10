#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin >> n;

    vector<int> a(n);
    for (int i = 0; i < n; i++)
        cin >> a[i];

    // First city
    cout << abs(a[0] - a[1]) << " " << abs(a[0] - a[n - 1]) << "\n";

    // Middle cities
    for (int i = 1; i < n - 1; i++) 
    {
        int mini = min(abs(a[i] - a[i - 1]), abs(a[i] - a[i + 1]));
        int maxi = max(abs(a[i] - a[0]), abs(a[i] - a[n - 1]));
        
        cout << mini << " " << maxi << "\n";
    }

    // Last city
    cout << abs(a[n - 1] - a[n - 2]) << " " << abs(a[n - 1] - a[0]) << "\n";

    return 0;
}
