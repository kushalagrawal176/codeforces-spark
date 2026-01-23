#include <bits/stdc++.h>
using namespace std;

long long countPairs(const vector<int>& a, int k) 
{
    long long cnt = 0;
    int n = a.size();
    int low = 0, high = n - 1;

    while (low < high) 
    {
        while (low < high && a[low] + a[high] > k)
            high--;
        
        cnt += (high - low);
        low++;
    }

    return cnt;
}

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, l, r;
        cin >> n >> l >> r;

        vector<int> a(n);
        for (int i = 0; i < n; i++)
            cin >> a[i];

        sort(a.begin(), a.end());

        cout << countPairs(a, r) - countPairs(a, l - 1) << "\n";
    }

    return 0;
}
