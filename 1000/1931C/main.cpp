#include <iostream>
#include <vector>
using namespace std;

int main() 
{
    int t;
    cin >> t; // Read number of test cases

    while (t--) 
    {
        int n;
        cin >> n; // Read size of array

        int cnt1 = 0; // Count of non-border elements for first case
        int cnt2 = 0; // Count of non-border elements for second case

        int idx1 = 0; // Start index for counting
        int idx2 = 0; // End index for counting

        vector<int> a(n);
        for (int i = 0; i < n; i++)
            cin >> a[i]; // Read array elements

        // Case 1: Remove elements equal to a[0] from both ends
        int i = 0;
        while (i < n && a[i] == a[0])
            i++; // Skip all elements from start equal to a[0]
        idx1 = i;

        i = n - 1;
        while (i >= 0 && a[i] == a[0])
            i--; // Skip all elements from end equal to a[0]
        idx2 = i;

        cnt1 = idx2 - idx1 + 1; // Count remaining elements

        // Case 2: Remove elements equal to a[n-1] from both ends
        i = 0;
        while (i < n && a[i] == a[n - 1])
            i++; // Skip all elements from start equal to a[n-1]
        idx1 = i;

        i = n - 1;
        while (i >= 0 && a[i] == a[n - 1])
            i--; // Skip all elements from end equal to a[n-1]
        idx2 = i;

        cnt2 = idx2 - idx1 + 1; // Count remaining elements

        // If all elements are same, result is 0
        if (abs(min(cnt1, cnt2)) == n)
            cout << 0 << endl;
        else
            // Print minimum of the two counts
            cout << min(cnt1, cnt2) << endl;
    }

    return 0;
}