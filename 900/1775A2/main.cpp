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

        if(s[1] == 'b')
            // s.substr(1, length) -> in C++, the second parameter is the length
            cout<<s[0]<<" "<<s.substr(1, s.length() - 2)<<" "<<s[s.length()-1]<<"\n";
        else
            cout<<s[0]<<" "<<s[1]<<" "<<s.substr(2)<<"\n";
    }

    return 0;
}