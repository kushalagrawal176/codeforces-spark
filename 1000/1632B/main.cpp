#include<bits/stdc++.h>
using namespace std;

int main() 
{    
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        cin >> n;
        
        int x = 1;
        while (x < n)
            x *= 2;

        x /= 2;
        
        // Print from x-1 down to 0
        for (int i = x - 1; i >= 0; i--)
            cout << i << " ";
        
        // Print from x up to n-1
        for (int i = x; i < n; i++)
            cout << i << " ";
        
        cout << "\n";
    }
    
    return 0;
}