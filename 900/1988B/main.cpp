#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--)
    {
        int n;
        string s;

        cin>>n>>s;

        int n1 = 0;
        int n0 = 0;
        bool b = true;

        for(int i=0; i<s.length(); i++) 
        {
            if(s[i] == '1') 
            {
                n1++;
                b = true;
            } 
            else if(s[i] == '0' && b)
            {
                n0++;
                b = false;
            }
        }

        if(n1 > n0)
            cout<<"YES\n";
        else
            cout<<"NO\n";
    }

    return 0;
}