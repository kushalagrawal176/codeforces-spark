#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin>>n;

    int totalCost = 0;
    int minPrice = INT_MAX;

    for(int i=0; i<n; i++) 
    {
        int a, p;
        cin>>a>>p;

        minPrice = min(minPrice, p);
        totalCost += a * minPrice;
    }

    cout<<totalCost<<"\n";

    return 0;
}