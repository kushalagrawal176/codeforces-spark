#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        cin >> n;

        vector<int> arr(n);
        for (int i = 0; i < n; i++)
            cin >> arr[i];

        // count = number of elements in the reduced subsequence
        int count = 1;

        // direction:
        //  0 = no direction yet
        //  1 = increasing
        // -1 = decreasing
        int direction = 0;

        for (int i = 0; i < n - 1; i++) 
        {
            // If the sequence goes up
            if (arr[i + 1] > arr[i]) 
            {
                // Already increasing → no new turning point
                if (direction == 1) 
                    continue;

                direction = 1;
                count++;
            }

            // If the sequence goes down
            else if (arr[i + 1] < arr[i]) 
            {
                // Already decreasing → no new turning point
                if (direction == -1) 
                    continue;

                direction = -1;
                count++;
            }

            // If arr[i+1] == arr[i], do nothing (flat)
        }

        cout << count << "\n";
    }

    return 0;
}