#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin>>n;

    vector<int> a(n);
    for(int i=0; i<n; i++)
        cin>>a[i];

    int cur = 0, max_len = 0;
    for(int i=0; i<2*n; i++) 
    {
        if(a[i%n] == 1) 
        {
            cur++;
            max_len = max(max_len, cur);
        } 
        else
            cur = 0;
    }

    cout<<min(max_len, n)<<"\n";

    return 0;
}