#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int t;
    cin>>t;
    
    while(t--)
    {
        long long n,a,b,c;
        cin>>n>>a>>b>>c;
        
        long long days = (n/(a+b+c))*3;
        long long cnt = 0;
        
        while(cnt < n%(a+b+c))
        {
            days++;
            cnt = cnt + a;
            
            if(cnt < n%(a+b+c))
            {
                days++;
                cnt = cnt + b;
            }
            else
                break;
            
            if(cnt < n%(a+b+c))
            {
                days++;
                cnt = cnt + c;
            }
        }
        
        cout<<days<<endl;
    }
    
    return 0;
}