#include <iostream>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        long long a, b, n, s;
        cin >> a >> b >> n >> s;

        if (s % n <= b && a * n + b >= s)
            cout << "YES" << endl;
        else
            cout << "NO" << endl;
    }

    return 0;
}
