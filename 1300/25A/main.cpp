#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin >> n;

    int even = 0, odd = 0;
    int e = -1, o = -1;

    for (int i = 0; i < n; i++) 
    {
        int a;
        cin >> a;

        if (a % 2 == 0) 
        {
            even++;
            e = i + 1; // store 1-based index
        } 
        else 
        {
            odd++;
            o = i + 1; // store 1-based index
        }
    }

    if (even == 1)
        cout << e << "\n";
    else
        cout << o << "\n";

    return 0;
}
