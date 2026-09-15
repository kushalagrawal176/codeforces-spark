#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin>>n;

    vector<int> a(n);
    for (int i=0; i<n; i++)
        cin>>a[i];

    // Store indices to keep track of original positions (1-based later)
    vector<int> idx(n);
    iota(idx.begin(), idx.end(), 0);

    // Sort indices descending based on the values in 'a'
    sort(idx.begin(), idx.end(), [&](int i, int j) {
        return a[i] > a[j];
    });

    long long shots = 0;
    for (int k=0; k<n; k++)
        shots += (1LL * a[idx[k]] * k) + 1;

    cout<<shots<<"\n";

    for(int i=0; i<n; i++)
        cout<<(idx[i] + 1) << (i == n - 1 ? "" : " ");

    cout << "\n";

    return 0;
}