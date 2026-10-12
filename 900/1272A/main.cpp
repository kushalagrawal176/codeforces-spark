#include<bits/stdc++.h>
using namespace std;

int main() 
{    
    int t;
    cin>>t;

    while(t--) 
    {
        long long a, b, c;
        cin>>a>>b>>c;

        long long ans = max((abs(a - b) + abs(a - c) + abs(b - c)) - 4, 0LL);

        cout<<ans<<"\n";
    }

    return 0;
}