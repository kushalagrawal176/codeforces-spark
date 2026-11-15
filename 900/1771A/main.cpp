#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        int n;
        cin>>n;

        vector<int> a(n);

        for(int i=0; i<n; i++)
            cin>>a[i];

        sort(a.begin(), a.end());

        long long min_count = 0;
        long long max_count = 0;

        for(int i=0; i<n; i++) 
        {
            if(a[i] == a[0])
                min_count++;
            else if(a[i] == a[n-1])
                max_count++;
        }

        if(min_count == n)
            cout<<min_count * (min_count - 1)<<"\n";
        else
            cout<<(min_count * max_count) * 2<<"\n";
    }

    return 0;
}