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

        int a;
        cin >> a;

        int maxSeat = a;
        int minSeat = a;
        string output = "YES";

        for (int i = 1; i < n; i++) 
        {
            cin >> a;

            if (a == maxSeat + 1)
                maxSeat++;
            else if (a == minSeat - 1)
                minSeat--;
            else
                output = "NO";
        }

        cout << output << "\n";
    }

    return 0;
}
