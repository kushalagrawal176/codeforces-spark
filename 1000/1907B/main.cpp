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
        
        stack<int> lower;
        stack<int> upper;
        
        for(int i=0;i<s.length();i++)
        {
            if(s[i] == 'b' && lower.size() > 0)
            {
                s[lower.top()] = 'b';
                lower.pop();
            }
            else if(s[i] == 'B' && upper.size() > 0)
            {
                s[upper.top()] = 'B';
                upper.pop();
            }
            else if(s[i] >= 'A' && s[i] <= 'Z')
                upper.push(i);
            else
                lower.push(i);
        }
        
        string ans = "";
        for(int i=0;i<s.length();i++)
        {
            if(s[i] != 'b' && s[i] != 'B')
                ans += s[i];
        }
        
        cout<<ans<<endl;
    }
    
    return 0;
}