#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int a[4];
    for(int i=0; i<4; i++)
        cin>>a[i];

    // Sort the array in ascending order
    sort(a, a+4);

    // Check for a non-degenerate triangle (TRIANGLE)
    if(a[0] + a[1] > a[2] || a[1] + a[2] > a[3])
        cout<<"TRIANGLE\n";
    // Check for a degenerate triangle / line segment (SEGMENT)
    else if(a[0] + a[1] == a[2] || a[1] + a[2] == a[3])
        cout<<"SEGMENT\n";
    // Otherwise, it's impossible to form either
    else
        cout<<"IMPOSSIBLE\n";

    return 0;
}