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
        
        int zero = 3;
        int one = 1;
        int two = 2;
        int three = 1;
        int five = 1;
        
        vector<int> a(n);
        for(int i=0;i<n;i++)
        {
            cin>>a[i];
        }
        
        int cnt = -1;
        
        for(int i=0;i<n;i++)
        {
            int num = a[i];
            
            if(num == 0)
                zero--;
            else if(num == 1)
                one--;
            else if(num == 2)
                two--;
            else if(num == 3)
                three--;
            else if(num == 5)
                five--;
            else
            {}
                
            if(zero <= 0 && one <= 0 && two <= 0 && three <= 0 && five <= 0)
            {
                cnt = i+1;
                break;
            }
        }
        
        if(cnt == -1)
            cout<<0<<endl;
        else
            cout<<cnt<<endl;
    }
    
    
    return 0;
}