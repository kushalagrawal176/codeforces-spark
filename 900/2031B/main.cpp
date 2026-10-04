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

        string s = "YES";

        for(int i=1; i<=n; i++) 
        {
            int a;
            cin>>a;

            if(abs(a-i) > 1)
                s = "NO";
        }

        cout<<s<<"\n";
    }

    return 0;
}