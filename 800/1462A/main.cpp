#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t; // number of test cases
    
    while (t--) 
    {
        int n;
        cin >> n; // size of the array
        vector<int> a(n);
        
        for (int i = 0; i < n; i++) 
        {
            cin >> a[i];
        }
        
        int left = 0;
        int right = n - 1;
        
        // Print elements alternately from left and right
        while (left < right) 
        {
            cout << a[left] << " " << a[right] << " ";
            left++;
            right--;
        }
        
        // If odd length, print the middle element
        if (left == right) 
        {
            cout << a[left] << " ";
        }
        
        cout << "\n";
    }
    
    return 0;
}
