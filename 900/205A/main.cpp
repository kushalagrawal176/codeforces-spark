#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin>>n;

    int min_val = INT_MAX, idx = -1, cnt = 0;
    for(int i=1; i<=n; i++) 
    {
        int x;
        cin>>x;

        if(x < min_val) 
        {
            min_val = x;
            idx = i;
            cnt = 1;
        } 
        else if(x == min_val)
            cnt++;
    }

    if(cnt > 1)
        cout<<"Still Rozdil\n";
    else
        cout<<idx<<"\n";

    return 0;
}