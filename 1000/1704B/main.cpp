#include<bits/stdc++.h>
using namespace std;

int main() 
{    
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        long long x;
        cin >> n >> x;
        
        long long a;
        cin >> a;
        
        long long l = a - x;
        long long r = a + x;
        
        int cnt = 0;
        for (int i = 1; i < n; i++) 
        {
            cin >> a;
            
            l = max(l, a - x);
            r = min(r, a + x);
            
            if (l > r) 
            {
                cnt++;
                l = a - x;
                r = a + x;
            }
        }
        
        cout << cnt << "\n";
    }
    
    return 0;
}