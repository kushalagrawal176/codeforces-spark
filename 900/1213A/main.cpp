#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin>>n;

    int odd = 0;
    int even = 0;

    for(int i=0; i<n; i++) 
    {
        int x;
        cin>>x;

        // Check if the coordinate is even or odd
        if(x%2 == 0)
            even++;
        else
            odd++;
    }

    // The minimum cost is moving all odd chips to even, or all even chips to odd
    cout<<min(odd, even)<<"\n";

    return 0;
}