#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    string s;
    cin>>s;
    string ans = "";
    
    for(int i=0;i<s.length();i++)
    {
        if(s[i] == 'h')
        {
            if(ans.length() == 0)
                ans = ans + 'h';
        }
        else if(s[i] == 'e')
        {
            if(ans.length() == 1)
                ans = ans + 'e';
        }
        else if(s[i] == 'l')
        {
            if(ans.length() == 2 || ans.length() == 3)
                ans = ans + 'l';
        }
        else if(s[i] == 'o')
        {
            if(ans.length() == 4)
                ans = ans + 'o';
        }
        else
        {}
    }
    
    if(ans == "hello")
        cout<<"YES";
    else
        cout<<"NO";
    
    return 0;
}