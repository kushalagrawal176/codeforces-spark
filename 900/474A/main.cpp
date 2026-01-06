#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    char ch;
    cin>>ch;
    
    string s;
    cin>>s;
    
    string t = "qwertyuiopasdfghjkl;zxcvbnm,./";
    
    if(ch == 'R')
    {
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<t.length();j++)
            {
                if(s[i] == t[j])
                {
                    s[i] = t[j-1];
                    break;
                }
            }
        }
        
        cout<<s<<endl;
    }
    else
    {
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<t.length();j++)
            {
                if(s[i] == t[j])
                {
                    s[i] = t[j+1];
                    break;
                }
            }
        }
        
        cout<<s<<endl;
    }
    
    return 0;
}