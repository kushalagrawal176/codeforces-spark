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
        string s;
        cin>>s;

        string ans = "";
        for(int i=0; i<n; i++) 
        {
            if((s[i] - '0') % 2 == 1)
                ans += s[i];

            if(ans.length() == 2)
                break;
        }

        if(ans.length() == 2)
            cout<<ans<<"\n";
        else
            cout<<"-1\n";
    }

    return 0;
}