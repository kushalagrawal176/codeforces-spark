#include<bits/stdc++.h>
using namespace std;

int main()
{
	int t;
	cin>>t;

	while(t--)
	{
		int n,k;
		cin>>n>>k;

		int a = n/k;

		if(n%k!=0)
            a += 1;

		int sum = a*k;

		if(sum%n == 0)
            cout<<sum/n<<endl;
		else 
            cout<<sum/n + 1<<endl;
	}
    
	return 0;
}