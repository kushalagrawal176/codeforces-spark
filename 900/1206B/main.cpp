#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin>>n;

    long long cost = 0;
    int negatives = 0;
    int zero = 0;

    for(int i = 0; i < n; i++) 
    {
        long long a;
        cin >> a;

        if(a == 0)
        {
            cost++;
            zero++;
        } 
        else if(a > 0) 
            cost += (a - 1);
        else 
        {
            cost += (-1 - a);
            negatives++;
        }
    }

    // If there is an odd number of negative elements and no zeros available 
    // to absorb the sign change, we must convert one -1 to 1 (or vice versa), costing 2 extra operations.
    if (negatives % 2 == 1 && zero == 0)
        cost += 2;

    cout << cost << "\n";

    return 0;
}