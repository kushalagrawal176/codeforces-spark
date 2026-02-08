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
        
        int a;
        cin>>a;
        
        for(int i=1;i<n-1;i++)
        {
            int b;
            cin>>b;
        }
        
        int b;
        cin>>b;
        
        if(a == b && a == 0)
            cout<<"BOB"<<endl;
        else
            cout<<"ALICE"<<endl;
    }
    
    return 0;
}