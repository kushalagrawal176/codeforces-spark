#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;
    
    while (t--) 
    {
        string s;
        cin >> s;  // read the binary string

        vector<int> segments;
        int count = 0;

        // Count lengths of consecutive '1' segments
        for (char c : s) 
        {
            if (c == '1')
                count++;
            else 
            {
                if (count > 0) 
                {
                    segments.push_back(count);
                    count = 0;
                }
            }
        }

        if (count > 0) 
            segments.push_back(count);

        // Sort segments in descending order
        sort(segments.rbegin(), segments.rend());

        // Alice takes the largest, Bob takes the next, and so on
        int sum = 0;
        for (int i = 0; i < segments.size(); i += 2)
            sum += segments[i];

        cout << sum << "\n";
    }

    return 0;
}
