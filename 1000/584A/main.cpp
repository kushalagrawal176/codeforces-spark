#include<bits/stdc++.h>
using namespace std;
 
int main() 
{
	int n;
	string t;
	cin >> n >> t;

	if (n < t.size())
		cout << -1;
	else
    {
		cout << t;

		for (int i = 0; i < n - t.size(); i++)
			cout << 0;
	}

    return 0;
}