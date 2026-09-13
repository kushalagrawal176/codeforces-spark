#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin>>n;
    
    string s;
    cin>>s;

    for(int d=2; d<=n; d++) 
    {
        if(n%d != 0)
            continue;

        // Reverse the prefix of length d
        for(int i=0; i<d/2; i++) 
        {
            char ch = s[i];
            s[i] = s[d-i-1];
            s[d-i-1] = ch;
        }
    }

    cout<<s<<"\n";

    return 0;
}