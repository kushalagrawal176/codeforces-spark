#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        int n, m;
        cin>>n>>m;

        int max_val = 0;
        for(int i=0; i<n; i++) 
        {
            int val;
            cin>>val;

            max_val = max(max_val, val);
        }

        for(int i=0; i<m; i++) 
        {
            char c;
            int l, r;
            cin>>c>>l>>r;

            if(max_val >= l && max_val <= r) 
            {
                if(c == '-') 
                    max_val--;
                else
                    max_val++;
            }

            cout<<max_val<<(i == m-1 ? "" : " ");
        }

        cout<<"\n";
    }

    return 0;
}