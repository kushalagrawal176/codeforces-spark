#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin>>n;

    int lc = 0;
    int c = 0;
    int la = 0;
    int ans = 0;

    for(int i=0; i<n; i++) 
    {
        int a;
        cin>>a;

        if(a == la)
            c++;
        else 
        {
            lc = c;
            c = 1;
        }

        la = a;
        ans = max(ans, min(lc, c));
    }

    cout<<ans*2<<"\n";

    return 0;
}