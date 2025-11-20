#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    string s;
    string t;
    
    cin>>s;
    cin>>t;
    
    for(int i=0;i<s.length()/2;i++)
    {
        swap(s[i], s[s.length()-1-i]);
    }
    
    if(s == t)
        cout<<"YES";
    else
        cout<<"NO";
    return 0;
}