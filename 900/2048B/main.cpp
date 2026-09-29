#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t-- > 0) 
    {
        int n, k;
        cin>>n>>k;

        int i = 1;
        int j = n;

        while(i <= j) 
        {
            int x = 0;

            while(x < k - 1 && j >= i) 
            {
                cout<<j--<<" ";
                x++;
            }

            if(i <= j)
                cout<<i++<<" ";
        }

        cout<<"\n";
    }

    return 0;
}