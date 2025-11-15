#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    int t;
    cin >> t; // number of test cases
    
    while(t--) {
        int n;
        cin >> n; // length of the array
        vector<int> a(n); // array representing jump lengths
        
        // read the array elements
        for(int i = 0; i < n; i++) 
            cin >> a[i];
        
        vector<long long> dp(n); // dp[i] stores max score starting from index i
        long long maxScore = 0;  // track the maximum score achievable
        
        // process from right to left (reverse order)
        for(int i = n - 1; i >= 0; i--) {
            dp[i] = a[i]; // base score: value at current index
            int j = i + a[i]; // next index after making the jump
            
            // if jump stays within bounds, add the score from that position
            if(j < n)
                dp[i] += dp[j];
            
            // update global maximum score
            maxScore = max(maxScore, dp[i]);
        }
        
        // print the maximum score for this test case
        cout << maxScore << "\n";
    }
    
    return 0;
}