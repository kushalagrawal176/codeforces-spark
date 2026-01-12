#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    string s;
    cin>>s;
    
    string ans = "";
    
    for(int i=0;i<s.length();i++)
    {
        if(s[i] == 'A' || s[i] == 'E' || s[i] == 'I' || s[i] == 'O' || s[i] == 'U' || s[i] == 'Y')
        {}
        else if(s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u' || s[i] == 'y')
        {}
        else
        {
            ans = ans + ".";
            if(s[i] >= 65 && s[i] <= 90)
                ans = ans + char(s[i] + 32);   
            else
                ans = ans + s[i];
        }
    }
    cout<<ans;
    
    return 0;
}