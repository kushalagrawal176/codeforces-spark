#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        int n;
        cin>>n;

        vector<int> a(n);
        for (int i = 0; i < n; i++)
            cin>>a[i];

        int ans = 0;

        // Use a for loop just like your original Java code to handle i-- automatically
        for(int i=n-2; i>=0; i--) 
        {
            // Skip elements matching the target value at the end
            while(i >= 0 && a[i] == a[n - 1])
                i--;

            if(i >= 0)
                ans++;

            // Calculate the length of the matched segment (b)
            int b = (n - 1) - i;
            
            // Jump `i` back
            i = i - b + 1;
        }

        cout << ans << "\n";
    }

    return 0;
}