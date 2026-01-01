#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int t;
    cin>>t;
    
    while(t--)
    {
        long n,k;
        cin>>n>>k;
        
        long cnt = 0;
        
        if(n&1 == 1)
        {
            cnt++;
            n = n-k;
            cnt = cnt + n/(k-1);
            if(n%(k-1) != 0)
                cnt++;
        }
        else
        {
            cnt = n/(k-1);
            if(n%(k-1) != 0)
                cnt++;
        }
        
        cout<<cnt<<endl;
    }
    
    return 0;
}