#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin>>n;

    long long odd = 0;
    long long min_odd = LLONG_MAX;
    long long sum = 0;

    for(int i=0; i<n; i++) 
    {
        long long num;
        cin>>num;

        if(num%2 != 0) 
        {
            odd++;
            min_odd = min(min_odd, num);
        }

        sum += num;
    }

    // If the count of odd numbers is odd, subtract the smallest odd number to make the sum even
    if(odd%2 == 1)
        cout<<sum - min_odd << "\n";
    else
        cout<<sum << "\n";

    return 0;
}