#include<iostream>
using namespace std;
 
int main()
{
    int n;
    cin>>n;
    
    int a;
    cin>>a;
    
    int maxi = a;
    int mini = a;
    
    n--;
    int cnt = 0;
    
    while(n--)
    {
        int b;
        cin>>b;
        
        if(maxi < b)
        {
            cnt++;
            maxi = b;
        }
        if(mini > b)
        {
            cnt++;
            mini = b;
        }
    }
    
    cout<<cnt;
    
    return 0;
}