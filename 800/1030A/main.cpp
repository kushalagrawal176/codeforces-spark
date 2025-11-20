#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int n;
    cin>>n;

    int cnt = 0;

    for(int i=0;i<n;i++)
    {
        int a;
        cin>>a;
        
        if(a == 1)
        {
            cnt++;
        }
    }
    
    if(cnt>0)
        cout<<"HARD";
    else
        cout<<"EASY";
        
    return 0;
}