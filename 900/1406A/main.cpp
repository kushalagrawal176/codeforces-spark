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
        vector<int> a(101, 0);

        for(int i=0; i<n; i++) 
        {
            int val;
            cin>>val;
            a[val]++;
        }

        int mex = 0;
        int t1 = 2;

        while(t1--) 
        {
            int index = 0;

            while(true) 
            {
                if(a[index] == 0) 
                {
                    mex += index;
                    break;
                } 
                else
                    a[index]--;

                index++;
            }
        }

        cout<<mex<<"\n";
    }

    return 0;
}