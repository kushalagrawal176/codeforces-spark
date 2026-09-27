#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        int a, b, c;
        cin>>a>>b>>c;

        int p = 0;
        int q = 0;
        int r = 0;

        if((b - c) % 2 == 0)
            p = 1;
        if((c - a) % 2 == 0)
            q = 1;
        if((a - b) % 2 == 0)
            r = 1;

        cout<<p<<" "<<q<<" "<<r<<"\n";
    }

    return 0;
}