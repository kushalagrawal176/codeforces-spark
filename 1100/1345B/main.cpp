#include <bits/stdc++.h>
using namespace std;

long long TotalCards(long long height) 
{
    // Function to calculate the total number of cards needed to build a pyramid of given height
    return (3LL * height * height + height) / 2;
}

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long n;
        cin >> n;

        int cnt = 0;
        while (n >= 2) // Minimum cards needed to build a pyramid of height 1 is 2
        {
            long long low = 1, high = 100000, height = 0;

            while (low <= high) // Binary search to find the maximum height of the pyramid that can be built with n cards
            {
                long long mid = low + (high - low) / 2;

                if (TotalCards(mid) <= n) // Check if we can build a pyramid of height mid with n cards
                {
                    height = mid;
                    low = mid + 1;
                } 
                else // If we cannot build a pyramid of height mid, try smaller heights
                    high = mid - 1;
            }

            n -= TotalCards(height); // Subtract the cards used to build the pyramid from n
            cnt++;
        }

        cout << cnt << "\n";
    }

    return 0;
}
