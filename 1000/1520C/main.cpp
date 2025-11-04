#include <iostream>
using namespace std;

int main() {
    int t;
    cin >> t;

    while (t--) 
    {
        int n;
        cin >> n;

        if (n == 2)
            cout << "-1" << "\n";
        else 
        {
            int cnt = 0; // for formatting output

            // Print odd numbers
            for (int i = 1; i <= n * n; i += 2) 
            {
                cout << i << " ";
                cnt++;

                if (cnt % n == 0)
                    cout << "\n";
            }

            // Print even numbers
            for (int i = 2; i <= n * n; i += 2) 
            {
                cout << i << " ";
                cnt++;

                if (cnt % n == 0)
                    cout << "\n";
            }
        }
    }

    return 0;
}
