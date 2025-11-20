#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int n;
    cin>>n;
    
    string s;
    cin>>s;
    
    int cnt = 0;
    
    for(int i=0;i<s.length();i++)
    {
        if(s[i] == 'A')
            cnt++;
    }
    
    if(cnt > s.length()-cnt)
        cout<<"Anton";
    else if(cnt < s.length()-cnt)
        cout<<"Danik";
    else
        cout<<"Friendship";
    
    return 0;
}