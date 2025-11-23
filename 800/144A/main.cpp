#include<bits/stdc++.h>
using namespace std;
 
int main()
{
	int n,mx=INT_MIN,mn=INT_MAX,p=0,q=0;cin>>n;
	for(int i=0;i<n;i++)
	{
		int a;
        cin>>a;

		if(a>mx)
        {
            p=i;
            mx=a;
        }
		if(a<=mn)
        {
            q=i;
            mn=a;
        }
	}
    
	if(p>q)
        cout<<(p-1)+(n-q)-1<<endl;
	else 
        cout<<(p-1)+(n-q)<<endl;

	return 0;
}