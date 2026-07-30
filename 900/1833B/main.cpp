#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while (t--) 
    {
        int n, k;
        cin>>n>>k;

        // Store elements of array 'a' along with their original indices
        vector<pair<int, int>> a(n);
        for (int i = 0; i < n; i++) 
        {
            cin>>a[i].first;
            a[i].second = i;
        }

        vector<int> b(n);
        for (int i = 0; i < n; i++)
            cin>>b[i];

        // Sort array 'a' based on the values (first element of the pair)
        sort(a.begin(), a.end());

        // Sort array 'b' in ascending order
        sort(b.begin(), b.end());

        vector<int> ans(n);
        for (int i = 0; i < n; i++)
            ans[a[i].second] = b[i];

        // Print the result
        for (int i = 0; i < n; i++)
            cout << ans[i] << (i == n - 1 ? "" : " ");
        cout << "\n";
    }

    return 0;
}