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
        vector<int> a(n);

        // Read input and increment each element by 1
        for (int i = 0; i < n; i++) 
        {
            cin >> a[i];
            a[i] += 1;
        }

        // Adjust elements to ensure no element divides the next
        for (int i = 0; i < n - 1; i++) 
        {
            if (a[i + 1] % a[i] == 0)
                a[i + 1] += 1;
        }

        // Print result
        for (int i = 0; i < n; i++) 
            cout << a[i] << " ";
        
        cout << "\n";
    }
    
    return 0;
}
