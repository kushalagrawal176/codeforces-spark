#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n, m;
    cin >> n >> m;

    vector<long long> prefix(n);
    for (int i = 0; i < n; i++) 
    {
        cin >> prefix[i];
        if (i > 0) 
            prefix[i] += prefix[i - 1];
    }

    while (m--) 
    {
        long long letter;
        cin >> letter;

        int left = 0, right = n - 1;

        // Binary search for the first prefix >= letter
        while (left < right) 
        {
            int mid = left + (right - left) / 2;
            if (prefix[mid] >= letter)
                right = mid;
            else
                left = mid + 1;
        }

        int dorm = left + 1;
        long long room;

        if (left == 0)
            room = letter;
        else
            room = letter - prefix[left - 1];

        cout << dorm << " " << room << "\n";
    }

    return 0;
}
