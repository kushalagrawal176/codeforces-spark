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

        if (n == 1)
            cout << "FastestFinger\n";
        else if (n == 2)
            cout << "Ashishgup\n";
        else if (n % 2 == 1)
            cout << "Ashishgup\n";
        else 
        {
            int cnt_odd = 0;
            int cnt_2 = 0;
            int temp = n;

            for (int i = 2; i <= sqrt(temp); i++) 
            {
                if (temp % i == 0) 
                {
                    while (temp % i == 0) 
                    {
                        temp /= i;
                        if (i == 2)
                            cnt_2++;
                        else
                            cnt_odd++;
                    }
                }
            }

            if (temp == 2) 
                cnt_2++;
            if (temp > 2) 
                cnt_odd++;

            if (cnt_2 > 1) 
            {
                if (cnt_odd > 0)
                    cout << "Ashishgup\n";
                else
                    cout << "FastestFinger\n";
            } 
            else 
            {
                if (cnt_odd > 1)
                    cout << "Ashishgup\n";
                else
                    cout << "FastestFinger\n";
            }
        }
    }

    return 0;
}
