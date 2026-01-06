#include <bits/stdc++.h>
using namespace std;
 
int main()
{
    int t, n;
    cin >> t;
    
    while (t --) 
    {
        cin >> n;
        
        int sum = 3, k = 3;
        
        while (n % sum != 0) 
        {
            sum += pow(2, k - 1);
            k ++;
        }
        
        cout << n / sum << '\n';
    }
}