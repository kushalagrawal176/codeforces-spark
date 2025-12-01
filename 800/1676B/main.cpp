#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;  // number of test cases

    while (t--) 
    {
        int n;
        cin >> n;  // number of children

        vector<int> a(n);
        cin >> a[0];
        int mini = a[0];  // track minimum candies

        // read remaining candies and find minimum
        for (int i = 1; i < n; i++) 
        {
            cin >> a[i];
            mini = min(mini, a[i]);
        }

        // compute total moves required
        int sum = 0;
        for (int i = 0; i < n; i++) 
        {
            sum += a[i] - mini;
        }

        cout << sum << "\n";
    }

    return 0;
}
