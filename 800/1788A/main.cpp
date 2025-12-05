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

        int two = 0; // count of elements equal to 2
        for (int i = 0; i < n; i++) 
        {
            cin >> a[i];
            if (a[i] == 2) 
                two++;
        }

        int curr = 0;
        int idx = -1;

        // Traverse the array to find the split point
        for (int i = 0; i < n; i++) 
        {
            if (a[i] == 2) 
            {
                curr++;
                two--;
            }
            if (curr == two) 
            {
                idx = i + 1; // +1 for 1-based index
                break;
            }
        }

        if (idx == -1)
            cout << -1 << "\n";
        else
            cout << idx << "\n";
    }

    return 0;
}
