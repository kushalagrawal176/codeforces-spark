#include <bits\stdc++.h>
using namespace std;

int main() 
{
	long long n,k;
	cin >> n >> k ;

	if(2*k-1<=n)
		cout << 2*k-1 ;
    else 
        cout << 2*(k-(n+1)/2) ;
}