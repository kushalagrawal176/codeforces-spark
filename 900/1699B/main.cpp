#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        int row, col;
        cin>>row>>col;

        for(int i=0; i<row; i++) 
        {
            for(int j=0; j<col; j++) 
                cout<<((i+1)/2+(j+1)/2)%2<<" ";
            cout<<"\n";
        }
    }

    return 0;
}