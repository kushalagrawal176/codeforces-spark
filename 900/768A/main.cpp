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

    int i = 0;
    int j = n-1;

    while(i < n && a[i] == a[0])
        i++;
    while(j >= 0 && a[j] == a[n-1])
        j--;

    cout<<max(0, j-i+1) <<"\n";

    return 0;
}