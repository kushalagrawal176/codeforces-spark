#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int k;
    cin>>k;

    string s;
    cin >> s;

    vector<int> freq(26, 0);

    // Count frequencies of each character
    for (char c : s)
        freq[c - 'a']++;

    // Check if all characters can be evenly divided by k
    bool flag = true;
    for (int i = 0; i < 26; i++) 
    {
        if (freq[i] % k != 0) 
        {
            flag = false;
            break;
        }
    }

    if (!flag) 
    {
        cout << -1 << "\n";
        return 0;
    }

    // Build the fundamental building block (one substring out of the k blocks)
    string base_pattern = "";
    for (int i = 0; i < 26; i++) 
    {
        int count = freq[i] / k;
        base_pattern.append(count, (char)(i + 'a'));
    }

    // Print the base pattern k times
    for (int l = 0; l < k; l++)
        cout << base_pattern;

    cout << "\n";

    return 0;
}