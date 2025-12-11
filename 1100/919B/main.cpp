#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int k;
    cin >> k;
    int i = 19;

    while (k > 0) 
    {
        int t = i;
        int sum = 0;
        while (t > 0) 
        {
            sum += t % 10;
            t /= 10;
        }

        if (sum == 10)
            k--;

        i++;
    }

    cout << i - 1 << endl;
    return 0;
}
