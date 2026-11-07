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

        if(n == 3)
            cout<<"NO";
        else if(n%2 == 0) 
        {
            cout<<"YES\n";

            for(int i=1; i<=n; i++) 
            {
                if(i%2 != 0)
                    cout<<-1<<" ";
                else
                    cout<<1<<" ";
            }
        } 
        else 
        {
            cout<<"YES\n";

            int x = n/2;
            int y = x-1;

            for(int i=1; i<=n; i++) 
            {
                if(i%2 != 0)
                    cout<<y<<" ";
                else
                    cout<<-x<<" ";
            }
        }

        cout<<"\n";
    }

    return 0;
}