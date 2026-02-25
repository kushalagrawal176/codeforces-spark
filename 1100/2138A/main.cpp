#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int k;
        long long x;
        cin >> k >> x;

        long long y = (1LL << (k + 1)) - x; // same as pow(2, k+1) but faster
        int count = 0;
        string str = "";

        while (x != y) 
        {
            count++;
            if (min(x, y) == x) 
            {
                str = "1 " + str;
                y -= x;
                x *= 2;
            } 
            else 
            {
                str = "2 " + str;
                x -= y;
                y *= 2;
            }
        }

        cout << count << "\n" << str << "\n";
    }

    return 0;
}
