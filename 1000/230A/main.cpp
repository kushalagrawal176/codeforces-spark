#include <bits/stdc++.h>
using namespace std;

int s,n,i;
pair<int,int> x[10001];

int main()
{
    cin>>s>>n;

    n = n-1;
    for(i=0;i<=n;i++)
      cin>>x[i].first>>x[i].second;  
    
    sort(x, x+n+1);

    for(i=0;i<=n;i++)
    {
        if(x[i].first < s)
            s = s + x[i].second;
        else
        {
            cout<<"NO";
            break;
        }
    }

    if(i-1 == n)
        cout<<"YES";
}