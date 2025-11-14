#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    int t; 
    cin >> t; // number of test cases
    
    while(t--) {
        int n; 
        cin >> n; // number of elements in the array
        vector<int> a(n);
        
        vector<int> freq(101, 0); // frequency array (since 1 <= ai <= 100)
        
        int odd = 0;   // count of odd numbers
        int even = 0;  // count of even numbers
        
        // Read array elements and count odd/even
        for(int i = 0; i < n; i++) {
            cin >> a[i];
            freq[a[i]]++;
            
            // Check parity of element
            if(a[i] & 1) // odd number
                odd++;
            else         // even number
                even++;
        }
        
        // Case 1: If both odd and even counts are even, we can pair them easily
        if((odd % 2 == 0) && (even % 2 == 0)) {
            cout << "YES\n";
        } else {
            // Case 2: Otherwise, check if there exists a pair of numbers
            // differing by exactly 1 (because such pairs can "fix" the parity issue)
            bool flag = false;
            for(int i = 0; i < n; i++) {
                if((a[i] > 1 && freq[a[i] - 1] > 0) || (a[i] + 1 < 101 && freq[a[i] + 1] > 0)) {
                    flag = true;
                    break;
                }
            }
            
            // If such a pair exists, answer is YES, else NO
            if(flag)
                cout << "YES\n";
            else
                cout << "NO\n";
        }
    }
    
    return 0;
}
