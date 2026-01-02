#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int t;
    cin>>t;
    
    while(t--)
    {
        int n;
        cin>>n;
        
        string s;
        cin>>s;
        
        int cnt = 0;
        char ch = s[0];
        
        for(int i=1;i<n;i++)
        {
            if(ch != s[i])
            {
                cnt++;
                ch = s[i];
            }
        }
        
        if(s[0] == '1')
            cnt++;
        
        cout<<cnt<<endl;
    }
    
    return 0;
}