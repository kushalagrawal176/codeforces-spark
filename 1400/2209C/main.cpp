#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int t;
    cin>>t;
    
    while(t-- > 0)
    {
        int n;
        cin>>n;

        int a;
        int idx = 0;
        for(int i=3;i<2*n;i+=2)
        {
            cout<<"? "<<i<<" "<<i+1<<endl<<flush;
            cin>>a;
            
            if(a == 1)
                idx = i;
        }
        
        cout<<"? 1 3"<<endl<<flush;
        cin>>a;
        
        if(a == 1)
            idx = 1;
        
        cout<<"? 1 4"<<endl<<flush;
        cin>>a;
        
        if(a == 1)
            idx = 1;
        
        if(idx == 0)
            cout<<"! 2"<<endl;
        else
            cout<<"! "<<idx<<endl;
    }
    
    return 0;
}