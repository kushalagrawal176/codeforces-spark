#include<bits/stdc++.h>
using namespace std;

int main() 
{    
    int t;
    cin >> t;

    while(t--) 
    {
        int n, r, b;
        cin >> n >> r >> b;

        // Calculate the number of full groups and the remainder
        int k = r / (b + 1);
        int m = r % (b + 1);
        
        for (int i = 1; i <= b + 1; i++) 
        {
            // Print the 'R's for the current group
            int r_count = k + (i <= m ? 1 : 0);
            for (int j = 0; j < r_count; j++)
                cout << 'R';
            
            // Print a 'B' separator if we aren't at the last group
            if (i <= b)
                cout << 'B';
        }

        cout << "\n";
    }
    
    return 0;
}