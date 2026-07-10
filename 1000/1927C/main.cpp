#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, m, k;
        cin >> n >> m >> k;

        // Using unordered_set to store distinct elements for O(1) lookups
        unordered_set<int> set1;
        unordered_set<int> set2;

        for (int i = 0; i < n; i++) 
        {
            int val;
            cin >> val;

            if (val <= k)
                set1.insert(val);
        }

        for (int i = 0; i < m; i++) 
        {
            int val;
            cin >> val;

            if (val <= k)
                set2.insert(val);
        }

        int exclusiveA = 0;
        int exclusiveB = 0;
        int common = 0;
        bool possible = true;

        for (int i = 1; i <= k; i++) 
        {
            bool inA = set1.count(i);
            bool inB = set2.count(i);

            if (inA && inB)
                common++;
            else if (inA)
                exclusiveA++;
            else if (inB)
                exclusiveB++;
            else
            {
                // Number 'i' is missing in both arrays
                possible = false;
                break;
            }
        }

        // Check if we can form exactly k/2 from each array
        if (!possible || exclusiveA > k / 2 || exclusiveB > k / 2)
            cout << "NO\n";
        else
            cout << "YES\n";
    }

    return 0;
}