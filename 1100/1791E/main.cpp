#include <iostream>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        cin >> n;

        int neg = 0; // to calculate number of negative elements
        long long sum = 0;
        long long mini = LLONG_MAX;

        for (int i = 0; i < n; i++) {
            long long a;
            cin >> a;
            if (a < 0)
                neg++;

            sum += llabs(a);
            mini = min(mini, llabs(a));
        }

        if (neg & 1)
            sum -= 2 * mini; // subtracting twice the minimum absolute value

        cout << sum << "\n";
    }

    return 0;
}