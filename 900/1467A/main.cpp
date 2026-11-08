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
        cout<<9;

        if(n == 1) 
        {
            cout<<"\n";
            continue;
        }

        for(int i=0; i<n-1; i++)
            cout<<(8+i)%10;
        cout<<"\n";
    }

    return 0;
}