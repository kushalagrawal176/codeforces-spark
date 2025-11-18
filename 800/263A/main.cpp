#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int i,j;
    int col, row;
    
    for(int i=0;i<5;i++)
    {
        for(int j=0;j<5;j++)
        {
            int a;
            cin>>a;
            if(a == 1)
            {
                col = j+1;
                row = i+1;
            }
        }
    }
    cout<<abs(col-3)+abs(row-3);
    return 0;
}