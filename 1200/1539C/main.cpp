#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    long long k, x;
    cin >> n >> k >> x;

    vector<long long> a(n);
    for (int i = 0; i < n; i++)
        cin >> a[i];

    // Step 1: Sort the array
    sort(a.begin(), a.end());

    // Step 2: Collect gaps that are greater than x
    vector<long long> gaps;
    for (int i = 1; i < n; i++) 
    {
        long long diff = a[i] - a[i - 1];
        if (diff > x) 
        {
            long long needed = (diff - 1) / x;
            gaps.push_back(needed);
        }
    }

    // Initial number of groups
    int groups = gaps.size() + 1;

    // Step 3: Greedily fill smallest gaps first
    sort(gaps.begin(), gaps.end());
    for (long long need : gaps) 
    {
        if (k >= need) 
        {
            k -= need;
            groups--;
        } 
        else
            break;
    }

    // Output result
    cout << groups << '\n';

    return 0;
}
