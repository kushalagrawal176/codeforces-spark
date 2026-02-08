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
        
        char prev = s[0];
        bool flag = true;
        
        for(int i=1;i<s.length();i++)
        {
            if(prev == 'Y' && s[i] == 'Y')
            {
                flag = false;
                break;
            }
            
            if(prev == s[i])
                prev = 'N';
            else
                prev = 'Y';
        }
        
        if(flag)
            cout<<"YES"<<endl;
        else
            cout<<"NO"<<endl;
    }
    
    return 0;
}