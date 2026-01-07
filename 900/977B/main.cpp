#include<bits/stdc++.h>

using namespace std;

int main()
{
	int n;
	cin>>n;

	string s, ans, p;
	cin>>s;

	map<string, int> mp;

	int maxm = 0;
	for(int i=0;i<n-1;i++)
	{
		p = s.substr(i, 2);
		mp[p]++;

		if(mp[p] > maxm)
		{
			maxm = mp[p];
			ans = p;
		}	
	}
	cout<<ans<<endl;
    
	return 0;
}