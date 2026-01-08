#include <bits/stdc++.h>
using namespace std;

char c;
long long si, sj, cnt;
int t, n, m;

int main()
{
	cin >> t;
	while(t --)
    {
		si = 0, sj = 0, cnt = 0;
		cin >> n >> m;

		for(int i = 1; i <= n; i ++)
        {
			for(int j = 1; j <= m; j ++)
            {
				cin >> c;

				if(c == '#')
                {
					si += i;
					sj += j;
					cnt ++;
				}
			}
        }
        
		cout << si/cnt << ' ' << sj/cnt << endl;		
	}
	
	return 0;
}