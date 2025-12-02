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
        
        s[s.length()-2] = 'i';
        s.pop_back();
        
        cout<<s<<endl;
    }
    
    return 0;
}