#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int n,m;
    cin>>n>>m;

    int a[n];
    int maxi = INT_MIN;
    int pos;

    for(int i=0;i<n;i++)
    {
        cin>>a[i];

        int cnt;
        cnt = a[i]/m;

        if(a[i]%m != 0)
            cnt++;

        if(maxi <= cnt)
        {
            maxi = cnt;
            pos = i+1;
        }
    }

    cout<<pos;

    return 0;
}