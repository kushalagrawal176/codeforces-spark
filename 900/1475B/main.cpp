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
        
        if(n%2020 == 0 || n%2021 == 0)
            cout<<"YES"<<endl;
        else
        {
            if(n/2020 >= n%2020)
                cout<<"YES"<<endl;
            else
                cout<<"NO"<<endl;
        }
    }
    
    return 0;
}