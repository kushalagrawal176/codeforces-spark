#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int t;
    cin>>t;
    
    while(t-- > 0)
    {
        int a;
        cin>>a;
        
        if(a+1 <= 67 && a+1 >= -67)
            cout<<a+1<<endl;
        else
            cout<<a<<endl;
    }
    
    return 0;
}