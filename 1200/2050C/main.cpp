#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        string s;
        cin >> s;

        long long sum = 0;
        int two = 0, three = 0;

        for (char c : s) 
        {
            int a = c - '0';
            sum += a;

            if (a == 2) 
                two++;
            if (a == 3) 
                three++;
        }

        bool flag = false;

        if (sum % 9 == 0)
            flag = true;
        else 
        {
            int left = 9 - (sum % 9); // the amount we need to add to make the sum divisible by 9

            if (left & 1)
                left += 9;

            left -= 6 * min(three, left / 6);

            if (left == 0)
                flag = true;
            else 
            {
                left -= 2 * min(two, left / 2);

                if (left == 0) 
                    flag = true;
                else 
                    flag = false;
            }
        }

        if (flag) 
            cout << "YES\n";
        else 
            cout << "NO\n";
    }

    return 0;
}
