// solution 1
#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long n;
        cin >> n;

        long long cnt = 0;
        while (n != 1) 
        {
            cnt += (n / 2) * 2;   // add pairs contribution
            n = n / 2 + n % 2;    // reduce n
        }

        cout << cnt << "\n";
    }

    return 0;
}

// solution 2
// #include <bits/stdc++.h>
// using namespace std;

// int main() 
// {
//     int t;
//     cin >> t;

//     while (t--) 
//     {
//         long long n;
//         cin >> n;
//         cout << (n + n - 2) << "\n";  // simplified formula
//     }

//     return 0;
// }
