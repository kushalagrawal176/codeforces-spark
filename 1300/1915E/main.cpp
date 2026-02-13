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
            cin >> a[i];

        unordered_set<long long> seen;
        long long sum = 0;
        bool flag = false;

        seen.insert(0); // initial prefix sum

        for (int i = 0; i < n; i++) 
        {
            if (i % 2 == 0)
                sum += a[i];
            else
                sum -= a[i];

            if (seen.count(sum)) 
            {
                flag = true;
                break;
            }
            
            seen.insert(sum);
        }

        cout << (flag ? "YES" : "NO") << "\n";
    }

    return 0;
}
