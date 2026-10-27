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

        bool flag = true;

        for(int i=0; i<n; i++) 
        {
            int x;
            cin>>x;

            if(!flag) 
                continue;

            int mx = max((n - i - 1) * 2, i * 2);
            if(x <= mx) 
                flag = false;
        }

        if(flag)
            cout<<"YES\n";
        else
            cout<<"NO\n";
    }

    return 0;
}