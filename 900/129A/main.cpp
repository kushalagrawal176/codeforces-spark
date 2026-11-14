#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin>>n;

    vector<int> a(n);
    int totalSum = 0;

    for(int i=0; i<n; i++) 
    {
        cin>>a[i];
        totalSum += a[i];
    }

    int count = 0;
    for(int i=0; i<n; i++) 
    {
        // Removing a bag results in an even sum if totalSum and a[i] have the same parity
        if(totalSum % 2 == a[i] % 2)
            count++;
    }

    cout<<count<<"\n";

    return 0;
}