#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int a, b, c, d;
    cin>>a>>b>>c>>d;

    int vasya = max(3 * a / 10, a - (a / 250) * c);
    int misha = max(3 * b / 10, b - (b / 250) * d);

    if(vasya > misha)
        cout<<"Misha\n";
    else if (vasya < misha)
        cout<<"Vasya\n";
    else
        cout<<"Tie\n";

    return 0;
}