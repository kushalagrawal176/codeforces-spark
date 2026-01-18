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
        
        vector<int> a(n);
        vector<int> b(n);
        
        int one_1 = 0;
        int one_2 = 0;
        
        for(int i=0;i<n;i++)  
        {
            cin>>a[i];
            if(a[i] == 1)
                one_1++;
        }
        for(int i=0;i<n;i++) 
        {
            cin>>b[i];
            if(b[i] == 1)
                one_2++;
        }
        
        for(int i=0;i<n;i++)
        {
            if(i%2 == 0)
            {
                if(one_1%2 == 1)
                    continue;
                else
                {
                    if(a[i] == 0 && b[i] == 1)
                    {
                        one_1++;
                        one_2--;
                    }
                    else if(a[i] == 1 && b[i] == 0)
                    {
                        one_1--;
                        one_2++;
                    }
                    else
                    {}
                }
            }
            else
            {
                if(one_2%2 == 1)
                    continue;
                else
                {
                    if(a[i] == 0 && b[i] == 1)
                    {
                        one_1++;
                        one_2--;
                    }
                    else if(a[i] == 1 && b[i] == 0)
                    {
                        one_1--;
                        one_2++;
                    }
                    else
                    {}
                }
            }
        }
        
        if(one_1%2 == one_2%2)
            cout<<"Tie"<<endl;
        else if(one_1%2 == 1)
            cout<<"Ajisai"<<endl;
        else
            cout<<"Mai"<<endl;
    }
    
    return 0;
}