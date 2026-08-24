#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        int n, counter = 0;
        cin>>n;
        
        vector<int> a(2 * n + 1);
        for(int i=1; i<=2*n;i++)
            cin>>a[i];

        for(int k=1; k<2*n;k++) 
        {
            if(a[k] != -1)
            {
                for(int j=k+1;j<=2*n;j++)
                {
                    if(a[k] != -1 && a[j] != -1 && (a[k]+a[j]) % 2 == 0 && counter < n-1)
                    {
                        cout << k << " " << j << "\n";
                        a[k] = -1;
                        a[j] = -1;
                        counter++;
                    }
                }
            }
        }
    }

    return 0;
}