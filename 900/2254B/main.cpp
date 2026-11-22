#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t-- > 0) 
    {
        int n;
        string s;

        cin>>n>>s;

        int dis = 1;
        int x = 0;

        for(int i=1; i<n; i++) 
        {
            if(s[i] != s[i-1])
                dis++;

            if(i == n-1)
                break;

            if(s[i] != s[i-1] && s[i] != s[i+1])
            {
                if(s[i+1] == s[i-1])
                    x = 2;

                x = max(x, 1);
            }
        }

        cout<<(dis-x)<<'\n';
    }

    return 0;
}