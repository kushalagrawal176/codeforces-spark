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
        vector<long long> a(n);

        for (int i = 0; i < n; i++) 
        {
            cin >> a[i];
        }

        long long sum = a[0];  // global maximum
        long long s = a[0];    // current subsequence sum

        for (int i = 1; i < n; i++) 
        {
            if ((a[i] & 1) == (a[i - 1] & 1)) 
            {
                // same parity → restart subsequence
                s = a[i];
            } 
            else 
            {
                // different parity → extend subsequence
                s = max(s + a[i], a[i]);
            }
            sum = max(sum, s);
        }

        sum = max(sum, s);
        cout << sum << "\n";
    }

    return 0;
}
