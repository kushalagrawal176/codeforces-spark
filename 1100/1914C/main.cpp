#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    int t;
    cin >> t; // number of test cases
    
    while(t--) {
        int n, k;
        cin >> n >> k; // n = size of arrays, k = maximum moves allowed
        
        vector<int> a(n), b(n);
        
        // read array a
        for(int i = 0; i < n; i++)
            cin >> a[i];
        
        // read array b
        for(int i = 0; i < n; i++)
            cin >> b[i];
        
        int i = 0; // index pointer for array a
        long long p = 0; // cumulative sum of chosen elements from a
        long long c = 0; // maximum value seen so far in b
        long long d = 0; // best possible score
        
        // simulate moves: either take from a or use reverse with b
        while(k-- > 0 && i < n) {
            p += a[i]; // add next element from a to cumulative sum
            c = max(c, (long long)b[i++]); // update max b value seen so far
            // compute best score: sum of chosen a + (remaining moves * best b)
            d = max(d, p + c * k);
        }
        
        // print the maximum score achievable
        cout << d << "\n";
    }
    
    return 0;
}
