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
        
        int sum = 0;
        int c1 = 0;
        int c2 = 0;
        
        for(int i=0;i<n;i++)
        {
            int a;
            cin>>a;
            
            sum = sum + a;
            
            if(a == 1)
                c1++;
            else
                c2++;
        }
        
        if(sum%2 == 0)
        {
            if((sum/2)%2 == 0)
                cout<<"YES"<<endl;
            else
            {
                if(c1 >= 2)
                    cout<<"YES"<<endl;
                else
                    cout<<"NO"<<endl;
            }
        }
        else
            cout<<"NO"<<endl;
    }
    
    return 0;
}