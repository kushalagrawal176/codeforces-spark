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
        
        int arr[n];
        for(int i=0;i<n;i++)
            cin>>arr[i];
            
        bool flag = true;
        
        for(int i=0;i<n-1;i++)
        {
            if(abs(arr[i+1]-arr[i]) == 5 || abs(arr[i+1]-arr[i]) == 7)
            {}
            else
            {
                flag = false;
                break;
            }
        }

        if(!flag)
            cout<<"NO"<<endl;
        else
            cout<<"YES"<<endl;
    }
    
    return 0;
}