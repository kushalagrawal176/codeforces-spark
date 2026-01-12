#include<bits/stdc++.h>
 
using namespace std;
 
int main()
{
    string s;
    cin>>s;
    
    bool flag = true;
    
    for(int i=1;i<s.length();i++)
    {
        if(s[i] >= 65 && s[i] <= 90)
        {}
        else
        {
            flag = false;
            break;
        }
    }
    
    if(flag == false)
        cout<<s;
    else
    {
        if(s[0] >= 65 && s[0] <= 90)
            s[0] = char(s[0] + 32);
        else
            s[0] = char(s[0] - 32);
        for(int i=1;i<s.length();i++)
        {
            s[i] = char(s[i] + 32);
        }
        
        cout<<s;
    }
    
    return 0;
}