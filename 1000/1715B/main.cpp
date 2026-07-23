#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while(t--) 
    {
        long long n, k, b, s;
        cin >> n >> k >> b >> s;

        // Check boundary conditions:
        // Minimum possible sum: b * k
        // Maximum possible sum: b * k + n * (k - 1)
        if(s < b * k || s > (b * k + n * (k - 1))) 
        {
            cout << -1 << "\n";
            continue;
        }

        vector<long long> arr(n, 0);

        // Assign the base value needed to achieve beauty 'b'
        arr[0] = b * k;
        long long remaining_sum = s - b * k;

        // Distribute the remaining sum (up to k - 1 per element)
        for(int i = 0; i < n && remaining_sum > 0; i++) 
        {
            long long add = min(remaining_sum, k - 1);
            arr[i] += add;
            remaining_sum -= add;
        }

        // Print the array
        for(int i = 0; i < n; i++)
            cout << arr[i] << (i == n - 1 ? "" : " ");
        cout << "\n";
    }

    return 0;
}