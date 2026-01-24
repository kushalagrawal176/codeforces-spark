#include <bits/stdc++.h>
using namespace std;

int main() 
{
    string s;
    cin >> s;

    int even = 0, odd = 0;
    unordered_map<char, int> mp;

    // Count frequency of each character
    for (char c : s)
        mp[c]++;

    // Check odd/even frequencies
    for (auto &p : mp) 
    {
        if (p.second % 2 == 0)
            even++;
        else
            odd++;
    }

    // Adjust odd count
    if (odd > 0) 
        odd--;

    // Decide winner
    if (odd % 2 == 0)
        cout << "First\n";
    else
        cout << "Second\n";

    return 0;
}
