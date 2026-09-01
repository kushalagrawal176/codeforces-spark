#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin>>n;

    int a[1001] = {0};
    for(int i = 0; i < n; i++) 
    {
        int val;
        cin>>val;

        a[val]++;
    }

    sort(a, a+1001);

    if(a[1000] <= (n + 1) / 2)
        cout << "YES\n";
    else
        cout << "NO\n";

    return 0;
}