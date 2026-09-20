#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        long long n, k;
        cin>>n>>k;

        long long cnt = 0;
        while(n != 0) 
        {
            cnt += n % k;
            n -= n % k;

            if(n == 0)
                break;

            n = n/k;
            cnt++;
        }

        cout<<cnt<<"\n";
    }

    return 0;
}