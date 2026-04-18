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
        
        vector<int> a(3*n, -1);
        int ptr = 3*n;
 
        for(int i=3*n-1;i>=0;i-=3)
        {
            a[i] = ptr;
            a[i-1] = ptr-1;
            
            ptr -= 2;
        }
        
        for(int i=3*n-3;i>=0;i-=3)
        {
            a[i] = ptr;
            ptr--;
        }
        
        for(int i=0;i<3*n;i++)
            cout<<a[i]<<" ";
        cout<<endl;
    }
    
    return 0;
}