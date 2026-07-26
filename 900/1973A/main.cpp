#include<bits/stdc++.h>
using namespace std;

int main() 
{    
    int t;
    cin >> t;
    
    while (t--) 
    {
        int a, b, c;
        cin >> a >> b >> c;
        
        // If the sum of scores is odd, it's impossible to finish with all draws (sum of points per game is 2)
        if ((a + b + c) % 2 == 1)
            cout << -1 << "\n";
        else 
        {
            // Maximum number of games cannot exceed (a + b + c) / 2 or a + b
            cout << min((a + b + c) / 2, a + b) << "\n";
        }
    }
    
    return 0;
}