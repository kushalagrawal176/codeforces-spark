#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int t;
    cin>>t;
    
    while(t--)
    {
        long long n;
        cin>>n;
        map<long long,long long> mp;
        
        long long cnt = 0;
        while(n!=1)
        {
            if(mp[n])
            {
                cnt = -1;
                break;
            }

            mp[n] = 1;

            if(n%6 == 0)
                n = n/6;
            else
                n = n*2;
                
            cnt++;
        }

        cout<<cnt<<endl;
    }
    
    return 0;
}