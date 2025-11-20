#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int n,h;
    cin>>n>>h;
    
    int cnt = 0;
    
    for(int i=0;i<n;i++)
    {
        int a;
        cin>>a;
        
        if(a>h)
            cnt=cnt+2;
        else
            cnt=cnt+1;
    }
    cout<<cnt;

    return 0;
}