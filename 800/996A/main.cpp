#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    long long n;
    cin>>n;
    
    long long cnt = 0;
    
    while(n > 0)
    {
        if(n/100 > 0)
        {
            cnt = cnt + n/100;
            n = n % 100;
        }
        else if(n/20 > 0)
        {
            cnt = cnt + n/20;
            n = n % 20;
        }
        else if(n/10 > 0)
        {
            cnt = cnt + n/10;
            n = n % 10;
        }
        else if(n/5 > 0)
        {
            cnt = cnt + n/5;
            n = n % 5;
        }
        else
        {
            cnt = cnt + n;
            break;
        }
    }
    
    cout<<cnt<<endl;
    
    return 0;
}