#include<bits/stdc++.h>
#define ll long long
using namespace std;

ll a[200007];
int t,n;

int main()
{
	cin>>t;
	while(t--)
    {
		cin>>n;
		ll sum = 0, mx = 0;
		int cnt = 0;

		for(int i=1;i<=n;i++)
        {
			cin>>a[i];
			sum += a[i];
			mx = max(mx, a[i]);
            
			if(mx*2 == sum) 
                cnt++;
		}

		cout<<cnt<<"\n";
    }   

	return 0;
}