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

        int count0 = 0;
        int count1 = 0;

        for(int i=0; i<n; i++) 
        {
            int val;
            cin>>val;

            if(val == 0)
                count0++;
            else if(val == 1)
                count1++;
        }

        if (count0 <= (n - count0) + 1)
            cout<<0<<"\n";
        else if (count1 == 0 || (n - count0 - count1) >= 1)
            cout<<1<<"\n";
        else
            cout<<2<<"\n";
    }

    return 0;
}