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
        for(int j=0; j<n; j++)
            cin>>a[j];

        int point = 0;
        for(int p=n-1; p>=0; p--) 
        {
            if(point < a[p])
                point = a[p];

            if(point != 0) 
            {
                point -= 1;
                a[p] = 1;
            } 
            else
                a[p] = 0; // Just in case, though it's already 0 or handled correctly
        }

        for(int i=0; i<n; i++)
            cout<<a[i]<<" ";
        cout<<"\n";
    }

    return 0;
}