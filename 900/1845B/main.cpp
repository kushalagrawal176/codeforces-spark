#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin>>n;

    while(n--) 
    {
        int a, b, c, d, e, f;
        cin>>a>>b>>c>>d>>e>>f;

        int sum = abs(a - c) + abs(a - e) + abs(b - d) + abs(b - f) - abs(c - e) - abs(d - f);

        cout<<sum/2 + 1<<"\n";
    }

    return 0;
}