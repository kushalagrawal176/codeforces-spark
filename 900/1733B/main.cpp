#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        int n, x, y;
        cin>>n>>x>>y;

        // Check the validity conditions
        if((x == 0 && y == 0) || (x != 0 && y != 0) || (x != 0 && ((n - 1) % x != 0)) || (y != 0 && ((n - 1) % y != 0)))
            cout<<-1<<"\n";
        else 
        {
            int lim = (x != 0) ? x : y;
            int temp = 1;
            int cnt = 0;

            for(int i=2; i<=n; i++) 
            {
                if(cnt == lim) 
                {
                    temp = i;
                    cnt = 0;
                }

                cnt++;
                cout<<temp<<" ";
            }

            cout<<"\n";
        }
    }

    return 0;
}