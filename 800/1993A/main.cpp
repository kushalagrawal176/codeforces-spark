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
        
        int ans[5] = {0};
        
        for(int i=0;i<s.length();i++)
        {
            if(s[i] == 'A')
                ans[0]=ans[0]+1;
            else if(s[i] == 'B')
                ans[1]=ans[1]+1;
            else if(s[i] == 'C')
                ans[2]=ans[2]+1;
            else if(s[i] == 'D')
                ans[3]=ans[3]+1;
            else
                ans[4]=ans[4]+1;
        }

        int sum = 0;
            
        for(int i=0;i<4;i++)
        {
            if(ans[i]>=n)
                sum=sum+n;
            else
                sum = sum+ans[i];
        }
            
        cout<<sum<<endl;
    }
    
    return 0;
}