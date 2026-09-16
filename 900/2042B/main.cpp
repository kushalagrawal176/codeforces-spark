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

        vector<int> a(n+1, 0);
        for(int i=0; i<n; i++) 
        {
            int x;
            cin>>x;

            a[x]++;
        }

        int p = 0, q = 0;
        for(int i=1; i<=n; i++) 
        {
            if(a[i] == 1)
                p++;
            else if(a[i] > 1)
                q++;
        }

        int ans = q + 2 * (p / 2 + p % 2);
        cout<<ans<<"\n";
    }

    return 0;
}