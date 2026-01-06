#include<bits/stdc++.h>
using namespace std;

int main()
{
    int a;
    cin>>a;
    
    int num1 = a/10;
    int num2 = (a/100)*10+a%10;
    
    cout<<max(num1, max(a, num2));
    
    return 0;
}