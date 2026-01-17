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
        unordered_map<int, int> freq;

        for (int i = 0; i < n; i++) 
        {
            cin >> arr[i];
            freq[arr[i]]++;
        }

        int maxFreq = 0;
        for (auto &p : freq)
            maxFreq = max(maxFreq, p.second);

        int uniqueSkills = freq.size();

        // The answer is max(min(maxFreq, uniqueSkills - 1), min(uniqueSkills, maxFreq - 1))
        int ans = max(min(maxFreq, uniqueSkills - 1), min(uniqueSkills, maxFreq - 1));

        cout << ans << "\n";
    }

    return 0;
}
