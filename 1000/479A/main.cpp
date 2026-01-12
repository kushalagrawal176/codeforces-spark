#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int a,b,c;
    cin>>a;
    cin>>b;
    cin>>c;
    
    int maxi = a+b+c;
    maxi = max(maxi, a+b*c);
    maxi = max(maxi, a*b*c);
    maxi = max(maxi, (a+b)*c);
    maxi = max(maxi, a*b+c);
    maxi = max(maxi, a*(b+c));
    
    cout<<maxi;
    
    return 0;
}