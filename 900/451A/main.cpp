#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int n,m;
    cin>>n>>m;
    
    char ch = 'a';
    
    while(n*m - (n+m-1) > 0)
    {
        n--;
        m--;
        
        if(ch == 'a')
            ch = 'm';
        else
            ch = 'a';
    }
    
    if(ch == 'a')
        cout<<"Akshat"<<endl;
    else
        cout<<"Malvika"<<endl;
    
    return 0;
}