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

        int left = 1;
        int right = 3*n;

        cout<<(n+1)/2<<'\n';

        while(left <= right) 
        {
            cout<<left<<' '<<right<<'\n';
            left += 3;
            right -= 3;
        }
    }

    return 0;
}