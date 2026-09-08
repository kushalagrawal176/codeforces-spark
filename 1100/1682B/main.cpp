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
        
        // (1 << 30) - 1 gives a number with all the lower 30 bits set to 1
        int ans = (1 << 30) - 1;

        for(int i = 0; i < n; i++) 
        {
            int x;
            cin>>x;

            if(x != i)
                ans &= x;
        }

        cout<<ans<<"\n";
    }

    return 0;
}