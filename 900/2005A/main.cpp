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

        string ans;
        ans.reserve(n);

        char arr[5] = {'a', 'e', 'i', 'o', 'u'};

        for(int i=0; i<5; i++) 
        {
            int x = (i < n % 5) ? 1 : 0;
            ans.append(n/5 + x, arr[i]);
        }

        cout<<ans<<'\n';
    }

    return 0;
}