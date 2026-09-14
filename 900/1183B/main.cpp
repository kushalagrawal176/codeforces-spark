#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        int n, k;
        cin>>n>>k;

        vector<int> a(n);
        for(int i=0; i<n; i++)
            cin>>a[i];

        sort(a.begin(), a.end());

        if (a[n-1]-k > a[0]+k)
            cout<<-1<<"\n";
        else
            cout<<a[0]+k<<"\n";
    }

    return 0;
}