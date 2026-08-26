#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin>>n;

    vector<int> a(n);
    for(int i=0; i<n; i++)
        cin>>a[i];

    sort(a.begin(), a.end());

    for(int i=n-1; i>=0; i--)
    {
        // If there's a duplicate of the max element, or if a[i] doesn't divide the max element cleanly
        if (a[i] == a[i - 1] || a[n - 1] % a[i] != 0) 
        {
            cout<<a[n-1]<<" "<<a[i]<<"\n";
            return 0;
        }
    }

    return 0;
}