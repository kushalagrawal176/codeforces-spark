#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;

    while (t--) 
    {
        int n, k;
        cin >> n >> k;

        int index = 1;
        while (k > index) 
        {
            k -= index;
            index++;
        }

        index++;
        for (int i = n; i >= 1; i--) 
        {
            if (i == index || k == i)
                cout << "b";
            else
                cout << "a";
        }

        cout << "\n";
    }
    
    return 0;
}
