#include<bits/stdc++.h>
using namespace std;

int main() 
{    
    int t;
    cin>>t;
    
    while (t--) 
    {
        int n, m, k;
        cin >> n >> m >> k;
        
        int cards_per_player = n / k;
        
        if (cards_per_player >= m || m == 0)
            cout << m << "\n";
        else 
        {
            // Remaining jokers to be distributed among the other (k - 1) players
            int remaining_jokers = m - cards_per_player;
            
            // Ceil division: (a + b - 1) / b is an efficient way to do ceil(a / b) with integers
            int r = (remaining_jokers + (k - 1) - 1) / (k - 1);
            
            cout << cards_per_player - r << "\n";
        }
    }

    return 0;
}