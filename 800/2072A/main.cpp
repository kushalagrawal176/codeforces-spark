#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int t;
    cin>>t;
    
    while(t--)
    {
        int n,k,p;
        cin>>n>>k>>p;
        
        int cnt = abs(k)/p;
        
        if(abs(k)%p != 0)
            cnt++;
            
        if(cnt <= n)
            cout<<cnt<<endl;
        else
            cout<<-1<<endl;
    }
    
    return 0;
}