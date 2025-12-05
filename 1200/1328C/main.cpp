#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t; // number of test cases
    
    while (t--) 
    {
        int n;
        cin >> n; // length of the ternary string
        string s;
        cin >> s; // input ternary string (digits '0', '1', '2')
        
        string a = ""; // first resulting string
        string b = ""; // second resulting string
        
        bool flag = false; 
        // flag indicates whether we have already "broken symmetry"
        // i.e., once we assign '1' to 'a' and '0' to 'b' for a '1',
        // from that point onward, 'a' must always be <= 'b'
        
        for (int i = 0; i < n; i++) 
        {
            char ch = s[i]; // current digit in the ternary string
            
            if (ch == '1') 
            {
                if (flag) 
                {
                    // After breaking symmetry, always keep 'a' smaller
                    a += '0';
                    b += '1';
                } 
                else 
                {
                    // First time we encounter '1', break symmetry here
                    flag = true;
                    a += '1';
                    b += '0';
                }
            } 
            else if (ch == '2') 
            {
                if (flag) 
                {
                    // After symmetry is broken, give all '2' to 'b'
                    a += '0';
                    b += '2';
                } 
                else 
                {
                    // Before symmetry is broken, split '2' evenly
                    a += '1';
                    b += '1';
                }
            } 
            else 
            { // ch == '0'
                // Both strings get '0' since sum must match original digit
                a += '0';
                b += '0';
            }
        }
        
        // Print the two resulting strings
        cout << a << "\n" << b << "\n";
    }
    
    return 0;
}
