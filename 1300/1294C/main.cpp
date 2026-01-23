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

        int a = -1, b = -1, c = -1;
        int cnt = 0;

        int temp = n;
        for (int i = 2; i * i < temp; i++) 
        {
            if (cnt >= 2) 
                break;
            if (temp % i == 0) 
            {
                if (cnt == 0) 
                    a = i;
                else if (cnt == 1) 
                    b = i;
                cnt++;
                temp /= i;
            }
        }

        if (cnt < 2 || temp == a || temp == b || temp == 1)
            cout << "NO\n";
        else 
        {
            c = temp;
            cout << "YES\n" << a << " " << b << " " << c << "\n";
        }
    }

    return 0;
}
