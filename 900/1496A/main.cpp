#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        int n, k;
        cin>>n>>k;
        string s;
        cin>>s;

        bool flag = true;
        for(int i=0; i<k; i++) 
        {
            if(s[i] != s[n-1-i]) 
            {
                flag = false;
                break;
            }
        }

        if(flag && (2*k < n))
            cout<<"YES\n";
        else
            cout<<"NO\n";
    }

    return 0;
}