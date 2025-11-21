#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    long long n;
    cin>>n;
    
    long long sum = 0;
    
    sum = sum + n/2;
    
    if(n%2 != 0)
        sum = sum - n;
    
    cout<<sum;
    
    return 0;
}