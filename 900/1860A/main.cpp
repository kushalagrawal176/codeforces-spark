#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        string s;
        cin>>s;

        int n = s.length();

        // x = (((...))) (n opening brackets followed by n closing brackets)
        string x = string(n, '(') + string(n, ')');
        
        // y = ()()() (alternating brackets repeated n times)
        string y = "";
        for (int i=0; i<n; i++)
            y += "()";

        if(x.find(s) == string::npos)
            cout<<"YES\n"<<x<<"\n";
        else if(y.find(s) == string::npos)
            cout<<"YES\n"<<y<<"\n";
        else
            cout<<"NO\n";
    }

    return 0;
}