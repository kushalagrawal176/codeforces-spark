#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while (t--) 
    {
        int n, c, d;
        cin >> n >> c >> d;

        int total_elements = n * n;
        vector<int> b(total_elements);
        for (int i = 0; i < total_elements; i++)
            cin >> b[i];

        // The minimum element in the given array must be the top-left corner a[0][0]
        sort(b.begin(), b.end());

        vector<int> a(total_elements);
        a[0] = b[0];

        // Reconstruct the progressive square in a 1D layout
        for(int i = 1; i < total_elements; i++) 
        {
            if (i % n != 0)
                a[i] = a[i - 1] + d; // Move right in the same row
            else
                a[i] = a[i - n] + c; // Move down to the start of the next row
        }

        sort(a.begin(), a.end());

        bool flag = true;
        for(int i = 0; i < total_elements; i++) 
        {
            if(a[i] != b[i]) 
            {
                flag = false;
                break;
            }
        }

        if(flag)
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}