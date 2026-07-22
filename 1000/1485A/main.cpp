#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int a, b;
        cin >> a >> b;

        int mini = INT_MAX;
        int cnt = 0;

        // Division by 1 is useless, so increase b once if needed.
        if (b == 1) 
        {
            b++;
            cnt = 1;
        }

        // Try increasing b and calculate the number of operations needed to reduce a to 0.
        // We will keep track of the minimum number of operations needed.
        // The loop continues until the count of operations exceeds the current minimum found.
        // This is because increasing b further will only increase the number of operations needed.
        // The loop will break when cnt >= mini, as we cannot find a better solution beyond that point.
        while (cnt < mini) 
        {
            int new_a = a;
            int new_b = b;
            int op = 0;

            // The inner while loop calculates the number of operations needed to reduce a to 0 by repeatedly dividing by b.
            // The outer while loop increments b and counts the number of operations until it finds a minimum.
            while (new_a != 0) 
            {
                op++;
                new_a /= new_b;
            }

            mini = min(mini, cnt + op);
            cnt++;
            b++;
        }

        cout << mini << "\n";
    }

    return 0;
}