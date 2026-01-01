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
        
        int ts = 0;
        int f = 0;
        int n = 0;
        
        for(int i=0;i<s.length();i++)
        {
            if(s[i] == 'T')
                ts++;
            else if(s[i] == 'N')
                n++;
            else if(s[i] == 'F')
                f++;
            else
            {}
        }
        
        string ans = "";
        for(int i=0;i<ts;i++)
            ans += 'T';
        for(int i=0;i<f;i++)
            ans += 'F';
        for(int i=0;i<n;i++)
            ans += 'N';
        
        for(int i=0;i<s.length();i++)
        {
            if(s[i] == 'T' || s[i] == 'F' || s[i] == 'N')
            {}
            else
                ans += s[i];
        }
 
        cout<<ans<<endl;
    }
    
    return 0;
}