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
        
        if(n%2 == 1)
        {
            cout<<0<<endl;
            continue;
        }
        
        int cnt = 0;
        
        if(n%2 == 0)
            cnt++;
        if(n%4 == 0)
            cnt++;
        
        for(int i=6;i<=n;i+=2)
        {
            if(i%2 == 0 && (n-i)%4 == 0)
                cnt++;
        }
        
        cout<<cnt<<endl;
    }
    
    return 0;
}