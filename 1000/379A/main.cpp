#include<bits/stdc++.h>
using namespace std;

int main()
{
    int a,b;
	cin>>a>>b;
	
    int rem;
    int cnt = 0;
    int i;
    
	cnt = cnt + a;
	
	while(a>=b)
	{
		i = a / b;
		cnt = cnt + i;
		rem = a % b;
		a = i + rem;
	}
	
	cout<<cnt;
}