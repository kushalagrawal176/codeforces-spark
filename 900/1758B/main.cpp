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

        if(n%2 == 0) 
        {
            n -= 2;
            cout<<"1 3 ";
        }

        while(n--)
            cout<<"2 ";

        cout<<"\n";
    }

    return 0;
}