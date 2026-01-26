#include <bits/stdc++.h>
using namespace std;

// Custom binary search: finds the first index >= low where a[idx] > num
int binary_search_custom(const vector<int>& a, int num, int low, int high) 
{
    int idx = -1;
    while (low <= high) 
    {
        int mid = low + (high - low) / 2;
        if (a[mid] > num) 
        {
            idx = mid;
            high = mid - 1;
        } 
        else
            low = mid + 1;
    }
    return idx;
}

int main() 
{
    int n;
    cin >> n;

    vector<int> a(n), b(n);
    for (int i = 0; i < n; i++) 
        cin >> a[i];
    for (int i = 0; i < n; i++) 
        cin >> b[i];

    // Transform a[i] = a[i] - b[i]
    for (int i = 0; i < n; i++)
        a[i] -= b[i];

    sort(a.begin(), a.end());

    long long cnt = 0;
    for (int i = 0; i < n; i++) 
    {
        int idx = binary_search_custom(a, -a[i], i + 1, n - 1);
        if (idx == -1) 
            continue;
            
        cnt += (n - idx);
    }

    cout << cnt << "\n";
    return 0;
}
