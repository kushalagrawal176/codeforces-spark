#include<bits/stdc++.h>
 
using namespace std;
 
int main()
{
    stack<char> s;
    
    string st;
    cin>>st;
    
    for(int i=0;i<st.length();i++)
    {
        if(st[i] == 'B')
        {
            if(s.size() > 0 && s.top() == 'U')
            {
                s.pop();
                if(s.size() > 0 && s.top() == 'W')
                {
                    s.pop();
                    s.push(' ');
                }
                else
                {
                    s.push('U');
                    s.push('B');
                }
            }
            else
                s.push('B');
        }
        else
            s.push(st[i]);
    }
    
    st = "";
    
    while(s.size() > 0)
    {
        st = s.top()+st;
        s.pop();
    }
    
    cout<<st;
    
    return 0;
}