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

        for(int i=0; i<n; i++) 
        {
            for(int j=0; j<n; j++) 
                cout<<((i == j || (i + 1) % n == j) ? 1 : 0)<<" ";
            cout<<"\n";
        }
    }

    return 0;
}