#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;
    
    while(t-- > 0) 
    {
        int n;
        cin >> n;
        long long sum = 0;
        
        for(int i = 0; i < n; i++) 
        {
            long long x;
            cin >> x;
            sum += x;
        }
        
        // Check if sum is a perfect square
        long long root = sqrt(sum);
        if(root * root == sum) 
        {
            cout << "YES" << endl;
        } 
        else 
        {
            cout << "NO" << endl;
        }
    }
    
    return 0;
}
