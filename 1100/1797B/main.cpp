#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        int n, k;
        cin>>n>>k;

        vector<vector<int>> v(n, vector<int>(n));
        for(int i=0; i<n; i++) 
        {
            for(int j=0; j<n; j++)
                cin>>v[i][j];
        }

        int i = 0;
        int j = n-1;

        // Check top and bottom halves for symmetry
        while(i < j) 
        {
            int p = 0;
            int q = n - 1;

            while(p < n) 
            {
                if(v[i][p] != v[j][q])
                    k--;

                p++;
                q--;

                if(k < 0) 
                break;
            }

            if(k < 0) 
                break;

            i++;
            j--;
        }

        // Check the middle row if n is odd
        if(n > 1 && n % 2 == 1) 
        {
            int row = n / 2;
            int a = 0;
            int b = n - 1;

            while(a <= b) 
            {
                if(v[row][a] != v[row][b])
                    k--;

                a++;
                b--;
            }
        }

        // Output results based on remaining operations (k) and grid size (n)
        if(k >= 0 && (k % 2 == 0 || n % 2 == 1))
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}