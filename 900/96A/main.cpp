#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    string s;
    cin>>s;
    bool flag = false;
    
    for(int i=0;i<s.length();i++)
    {
        int cnt = 1;
        int j = i+1;

        while(j<s.length() && s[j] == s[i])
        {
            cnt++;
            if(cnt>=7)
            {
                flag = true;
                break;
            }
            j++;
        }
        
        if(flag)
            break;
    }
    
    if(flag)
        cout<<"YES";
    else
        cout<<"NO";
    
    return 0;
}