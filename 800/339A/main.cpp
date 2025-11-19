#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    string s;
    cin>>s;
    
    int a = 0; // count of '1' 
    int b = 0; // count of '2'
    int c = 0; // count of '3'
    
    for(int i=0;i<s.length();i++)
    {
        if(s[i] == '1')
            a++;
        else if(s[i] == '2')
            b++;
        else if(s[i] == '3')
            c++;
        else
        {}
    }
    
    for(int i=0;i<s.length();i++)
    {
        if(s[i] == '+')
        {}
        else
        {
            if(a>0)
            {
                s[i] = '1';
                a--;
            }
            else if(b>0)
            {
                s[i] = '2';
                b--;
            }
            else
            {
                s[i] = '3';
                c--;
            }
        }
    }

    cout<<s;
    
    return 0;
}